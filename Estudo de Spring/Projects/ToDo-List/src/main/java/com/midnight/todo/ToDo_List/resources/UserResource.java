package com.midnight.todo.ToDo_List.resources;

import com.midnight.todo.ToDo_List.dto.UserDTO;
import com.midnight.todo.ToDo_List.entities.User;
import com.midnight.todo.ToDo_List.resources.util.URL;
import com.midnight.todo.ToDo_List.services.UserService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> users =  userService.findAll();

        return ResponseEntity.ok().body(users);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = userService.findById(id);

        return ResponseEntity.ok().body(user);
    }

    @GetMapping(value = "/username-search")
    public ResponseEntity<User> findByUsername(@RequestParam(value = "text", defaultValue = "") String text){
        text = URL.decodeParam(text);

        User user = userService.findByUsername(text);

        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDTO userDTO){
        User user = userService.create(userDTO);

        return ResponseEntity.ok().body(user);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody UserDTO obj){
        User user = userService.update(id, obj);

        return ResponseEntity.ok().body(user);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        userService.delete(id);

        return ResponseEntity.ok().build();
    }
}
