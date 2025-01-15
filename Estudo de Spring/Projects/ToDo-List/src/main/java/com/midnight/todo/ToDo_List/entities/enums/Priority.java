package com.midnight.todo.ToDo_List.entities.enums;

public enum Priority {
    high("High"),
    mid("Mid"),
    low("Low");

    public String name;

    Priority(String name){
        this.name = name;
    }
}
