package com.guilherme.todolist.repositories;

import com.guilherme.todolist.entities.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByUsername(String username);
}
