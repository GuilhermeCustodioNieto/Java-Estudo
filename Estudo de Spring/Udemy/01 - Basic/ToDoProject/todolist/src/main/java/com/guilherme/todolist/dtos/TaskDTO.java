package com.guilherme.todolist.dtos;

import com.guilherme.todolist.entities.task.enums.TaskStatus;

import java.util.Date;

public record TaskDTO(String title, String description, Date dueDate, TaskStatus status) {
}
