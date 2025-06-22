//package com.guilherme.todolist.entities.tasklist;
//
//import com.guilherme.todolist.entities.task.Task;
//import com.guilherme.todolist.entities.task.TaskInterface;
//import jakarta.persistence.*;
//
//import java.util.List;
//import java.util.Objects;
//
//@Entity
//@Table(name = "tbl_tasklist")
//public class TaskList implements TaskListInterface{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column
//    private String title;
//
//    @Column
//    private List<TaskInterface> taskList;
//
//    public TaskList(Integer id, String title, List<TaskInterface> taskList) {
//        this.id = id;
//        this.title = title;
//        this.taskList = taskList;
//    }
//
//    public TaskList(String title, List<TaskInterface> taskList) {
//        this.title = title;
//        this.taskList = taskList;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public List<TaskInterface> getTaskList() {
//        return taskList;
//    }
//
//    public void setTaskList(List<TaskInterface> taskList) {
//        this.taskList = taskList;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        TaskList taskList = (TaskList) o;
//        return Objects.equals(id, taskList.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
//
//    @Override
//    public String toString() {
//        return "TaskList{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", taskList=" + taskList +
//                '}';
//    }
//}
