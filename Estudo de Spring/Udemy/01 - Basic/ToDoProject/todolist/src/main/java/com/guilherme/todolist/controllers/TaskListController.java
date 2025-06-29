package com.guilherme.todolist.controllers;

import com.guilherme.todolist.dtos.TaskListDTO;
import com.guilherme.todolist.entities.tasklist.TaskList;
import com.guilherme.todolist.services.TaskListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users/{userId}/task-lists")
public class TaskListController {
    private TaskListService service;

    public TaskListController(TaskListService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<TaskList>> findAll(){
        return ResponseEntity.ok().body(this.service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<TaskList> findById(@PathVariable("id") Integer id){
        try{
            var taskList = service.findById(id);
            return ResponseEntity.ok().body(taskList);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("")
    public ResponseEntity<List<TaskList>> findByTitle(@RequestParam("title") String title){
        try{
            var taskLists = service.findByTitle(title);
            return ResponseEntity.ok().body(taskLists);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<TaskList> create(@RequestBody TaskListDTO taskListDTO, @PathVariable("userId") Integer userId){
        try{
            return ResponseEntity.ok().body(service.create(taskListDTO, userId));
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("{id}")
    public ResponseEntity<TaskList> update(@PathVariable("id") Integer id, @RequestBody TaskListDTO taskListDTO){
        try{
            var taskList = service.update(taskListDTO, id);
            return ResponseEntity.ok().body(taskList);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        try{
            service.delete(id);
            return ResponseEntity.ok().build();
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }


}
