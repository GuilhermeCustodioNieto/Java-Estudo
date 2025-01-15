package com.midnight.todo.ToDo_List.services;

import com.midnight.todo.ToDo_List.entities.Task;
import com.midnight.todo.ToDo_List.entities.exceptions.ObjectNotFoundException;
import com.midnight.todo.ToDo_List.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll(){
        return taskRepository.findAll();
    }

    public Optional<Task> findById(long id){
        Optional<Task> task1 = taskRepository.findById(id);
        if(task1.isEmpty()){
            throw new ObjectNotFoundException("The task is not found");
        }

        return taskRepository.findById(id);
    }

    public Task insert(Task task){
        return taskRepository.save(task);
    }

    public Task update(Long id, Task task){
        try{
            Optional<Task> task1 = taskRepository.findById(id);
            if(task1.isEmpty()){
                throw new ObjectNotFoundException("The task is not found");
            }

            Task task2 = task1.get();

            task2.setTitle(task.getTitle());
            task2.setDescription(task.getDescription());
            task2.setDueDate(task.getDueDate());
            task2.setStatus(task.getStatus());
            task2.setPriority(task.getPriority());

            return taskRepository.save(task2);

        } catch (ObjectNotFoundException e){
            e.printStackTrace();
        }
        return task;
    }

    public void delete(Long id){
        try{
            taskRepository.deleteById(id);

        } catch (ObjectNotFoundException e){
            e.printStackTrace();
        }
    }
}
