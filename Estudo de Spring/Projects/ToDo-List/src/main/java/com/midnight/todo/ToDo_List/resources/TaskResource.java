package com.midnight.todo.ToDo_List.resources;

import com.midnight.todo.ToDo_List.entities.Task;
import com.midnight.todo.ToDo_List.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {
    @Autowired
    private TaskService taskService;


    @GetMapping
    public ResponseEntity<List<Task>> findAll(){
        List<Task> tasks = taskService.findAll();
        return ResponseEntity.ok().body(tasks);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Task> findById(@PathVariable Long id){
        Optional<Task> task = taskService.findById(id);

        if(task.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(task.get());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Task> create(@RequestBody Task task){
        System.out.println(task);
        task = taskService.insert(task);
        return ResponseEntity.ok().body(task);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Task> update(@PathVariable Long id, @RequestBody Task task){
        task = taskService.update(id, task);

        return ResponseEntity.ok().body(task);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Task> delete(@PathVariable Long id){
        taskService.delete(id);

        return ResponseEntity.ok().build();
    }


}
