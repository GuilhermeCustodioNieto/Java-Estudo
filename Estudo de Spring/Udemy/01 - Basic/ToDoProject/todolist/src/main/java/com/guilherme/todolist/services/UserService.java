package com.guilherme.todolist.services;

import com.guilherme.todolist.dtos.UserDTO;
import com.guilherme.todolist.entities.User;
import com.guilherme.todolist.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public List<User> findByUsername(String username){
        return repository.findByUsername(username);
    }

    public User findById(Integer id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("No user found with " + id + " id."));
    }

    public User create(UserDTO userDTO){
        User user = new User(userDTO.username(), userDTO.email(), userDTO.password());
        return repository.save(user);
    }

    public User update(UserDTO userDTO, Integer id) throws Exception {
        User user = findById(id);
        System.out.println(userDTO);
        if(userDTO.username() != null){ user.setUsername(userDTO.username()); }
        if(userDTO.email() != null) {user.setEmail(userDTO.email());}
        if(userDTO.password()    != null) {user.setPassword(userDTO.password());}

        return repository.save(user);
    }

    public void delete(Integer id) throws Exception {
        User user = findById(id);
        repository.delete(user);
    }
}
