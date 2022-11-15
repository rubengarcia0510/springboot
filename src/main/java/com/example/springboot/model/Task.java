package com.example.springboot.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Task {

    private Integer id;
    private Integer priority;
    private String description;
    @DateTimeFormat("yyyy-MM-dd")
    private LocalDate date;

    public Task() {
    }

    public Task(Integer priority, String description,LocalDate date) {
        this.priority = priority;
        this.description = description;
        this.date=date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
