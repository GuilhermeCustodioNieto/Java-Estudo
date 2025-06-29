package com.guilherme.todolist.controllers;

import com.guilherme.todolist.dtos.TaskDTO;
import com.guilherme.todolist.entities.task.Task;
import com.guilherme.todolist.services.TaskService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("task-lists/{taskListId}/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody TaskDTO taskDTO, @PathVariable("taskListId") Integer taskListId) {
        try{
            return ResponseEntity.ok(taskService.createForTaskList(taskListId, taskDTO));
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }


    }

    @GetMapping
    public ResponseEntity<List<Task>> findAllTasks(@PathVariable("taskListId") Integer taskListId) {
        try {
            return ResponseEntity.ok(taskService.findAllByTaskList(taskListId));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findById(@PathVariable("id") int id){
        try{
            return ResponseEntity.ok(taskService.findById(id));
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Task>> findByTitle(@RequestParam("title") String title, @PathVariable("taskListId") Integer taskListId){
        return ResponseEntity.ok(taskService.findByTitle(title, taskListId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable("id") int id, @RequestBody TaskDTO taskDTO){
        try{
            return ResponseEntity.ok(taskService.update(id, taskDTO));
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id){
        try{
            taskService.deleteTask(id);
            return ResponseEntity.ok().build();
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
