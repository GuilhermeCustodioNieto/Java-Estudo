package com.midnight.todo.ToDo_List.repository;

import com.midnight.todo.ToDo_List.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
