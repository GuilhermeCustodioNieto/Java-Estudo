package com.guilherme.todolist.controllers;

import com.guilherme.todolist.dtos.UserDTO;
import com.guilherme.todolist.entities.User;
import com.guilherme.todolist.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/search")
    public ResponseEntity<List<User>> findByUsername(@RequestParam String username){
        return ResponseEntity.ok().body(service.findByUsername(username));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") Integer id){
        try{
            return ResponseEntity.ok().body(service.findById(id));
        } catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(service.create(userDTO));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable("id") Integer id, @RequestBody UserDTO userDTO){
        try{
            return ResponseEntity.ok().body(service.update(userDTO, id));
        } catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        try{
            service.delete(id);
            return ResponseEntity.ok().build();
        } catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

}
