package com.midnight.todo.ToDo_List.entities.enums;

public enum Status {
    complete("Complete"),
    pending("Pending");

    public String statusName;
    Status(String statusName){
        this.statusName = statusName;
    }
}
