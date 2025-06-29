package com.guilherme.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guilherme.todolist.entities.tasklist.TaskList;

import java.util.List;

public interface TaskListRepository extends JpaRepository<TaskList, Integer> {
    List<TaskList> findByTitle(String title);
}
