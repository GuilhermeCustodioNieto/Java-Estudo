package com.guilherme.todolist.services;

import com.guilherme.todolist.dtos.TaskListDTO;
import com.guilherme.todolist.entities.User;
import com.guilherme.todolist.entities.tasklist.TaskList;
import com.guilherme.todolist.repositories.TaskListRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListService {
    private TaskListRepository repository;
    private final UserService userService;

    public TaskListService(UserService userService, TaskListRepository repository) {
        this.userService = userService;
        this.repository = repository;
    }

    public List<TaskList> findAll(){
        return repository.findAll();
    }

    public TaskList findById(Integer id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("No taskList found with " + id + " id"));
    }

    public List<TaskList> findByTitle(String title) throws Exception {
        try{
            return repository.findByTitle(title);
        } catch (Exception e){
            throw new Exception("No TaskList found with " + title + " title.");
        }
    }

    public TaskList create(TaskListDTO dto, Integer userId) throws Exception {
        User user = userService.findById(userId);
        TaskList taskList = new TaskList(dto.title(), user);

        return repository.save(taskList);
    }

    public TaskList update(TaskListDTO dto, Integer id) throws Exception {
        TaskList taskList = findById(id);
        taskList.setTitle(dto.title());
        return repository.save(taskList);
    }

    public void delete(Integer id) throws Exception {
        TaskList taskList = findById(id);
        repository.delete(taskList);
    }
}
