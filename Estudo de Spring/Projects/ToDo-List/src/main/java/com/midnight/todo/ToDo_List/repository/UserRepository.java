package com.midnight.todo.ToDo_List.repository;

import com.midnight.todo.ToDo_List.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsernameContainingIgnoreCase(String text);
}
