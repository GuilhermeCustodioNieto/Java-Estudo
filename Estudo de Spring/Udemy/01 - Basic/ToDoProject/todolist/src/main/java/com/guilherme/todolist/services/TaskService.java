package com.guilherme.todolist.services;

import com.guilherme.todolist.dtos.TaskDTO;
import com.guilherme.todolist.entities.task.Task;
import com.guilherme.todolist.entities.task.enums.TaskStatus;
import com.guilherme.todolist.entities.tasklist.TaskList;
import com.guilherme.todolist.repositories.TaskListRepository;
import com.guilherme.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository repository;
    private final TaskListService taskListService;

    public TaskService(TaskRepository repository, TaskListService taskListService) {
        this.repository = repository;
        this.taskListService = taskListService;
    }

    public Task createTask(TaskDTO newTask){
        Task task = new Task(newTask.title(), newTask.description(), newTask.dueDate(), TaskStatus.PENDING);
        return task;
    }

    public List<Task> findAll(){
        return this.repository.findAll();
    }

    public List<Task> findByTitle(String title, Integer id){
        return this.repository.findByTitleAndTaskListId(title, id);
    }

    public Task findById(Integer id) throws Exception {
        Optional<Task> task =  this.repository.findById(id);
        if(task.isEmpty()){
            throw new Exception("Task not found with id: " + id);
        }

        return task.get();
    }

    public List<Task> findAllByTaskList(Integer taskListId) throws Exception {
        TaskList taskList = taskListService.findById(taskListId);
        return repository.findAllByTaskListId(taskList.getId());
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

    public Task createForTaskList(Integer taskListid, TaskDTO taskDTO) throws Exception{
        TaskList taskList = taskListService.findById(taskListid);

        Task task = createTask(taskDTO);
        task.setTaskList(taskList);

        return repository.save(task);
    }
}
