package com.guilherme.todolist.services;

import com.guilherme.todolist.dtos.TaskDTO;
import com.guilherme.todolist.entities.task.Task;
import com.guilherme.todolist.entities.task.enums.TaskStatus;
import com.guilherme.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository repository;

    @Autowired
    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task createTask(TaskDTO newTask){
        Task task = new Task(newTask.title(), newTask.description(), newTask.dueDate(), TaskStatus.PENDING);
        return this.repository.save(task);
    }

    public List<Task> findAll(){
        return this.repository.findAll();
    }

    public List<Task> findByTitle(String title){
        return this.repository.findByTitle(title);
    }

    public Task findById(Integer id) throws Exception {
        Optional<Task> task =  this.repository.findById(id);
        if(task.isEmpty()){
            throw new Exception("Task not found with id: " + id);
        }

        return task.get();
    }

    public Task update(Integer id, TaskDTO updatedTask) throws Exception {
        Task task = findById(id);

        if (updatedTask.title() != null) task.setTitle(updatedTask.title());
        if (updatedTask.description() != null) task.setDescription(updatedTask.description());
        if (updatedTask.dueDate() != null) task.setDueDate(updatedTask.dueDate());
        if (updatedTask.status() != null) task.setStatus(updatedTask.status());

        return repository.save(task);
    }


    public void deleteTask(int id) throws Exception {
        if(!repository.existsById(id)){
            throw new Exception("Task not found with id: " + id);
        }
        this.repository.deleteById(id);
    }






}
