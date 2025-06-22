package com.guilherme.todolist.repositories;

import com.guilherme.todolist.entities.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByTitle(String title);
}
