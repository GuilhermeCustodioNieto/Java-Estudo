package com.midnight.todo.ToDo_List.services;

import com.midnight.todo.ToDo_List.dto.UserDTO;
import com.midnight.todo.ToDo_List.entities.User;
import com.midnight.todo.ToDo_List.entities.exceptions.ObjectNotFoundException;
import com.midnight.todo.ToDo_List.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);

        if(user.isEmpty()){
            throw new ObjectNotFoundException("User not found");
        }

        return user.get();
    }

    public User findByUsername(String text){
        Optional<User> user = userRepository.findByUsernameContainingIgnoreCase(text);

        if(user.isEmpty()){
            throw new ObjectNotFoundException("User not found");
        }

        return user.get();
    }

    public User create(UserDTO user){
        return userRepository.save(new User(user.getUsername(), user.getEmail(), user.getPassword()));
    }

    public User update(Long id, UserDTO obj){
        Optional<User> temp = userRepository.findById(id);

        if(temp.isEmpty()){
            throw new ObjectNotFoundException("User not found");
        }

        User user = temp.get();

        user.setUsername(obj.getUsername());
        user.setEmail(obj.getEmail());
        userRepository.save(user);

        return user;
    }

    public void delete(Long id){
        Optional<User> temp = userRepository.findById(id);

        if(temp.isEmpty()){
            throw new ObjectNotFoundException("User not found");
        }

        userRepository.delete(temp.get());
    }
}
