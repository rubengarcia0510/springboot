package com.example.springboot.controller;

import com.example.springboot.model.Task;
import com.example.springboot.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    TaskRepository taskRepository;

    @RequestMapping("/")
    public String getTasks(Model model){
        List<Task> tasks=taskRepository.findAll();
        model.addAttribute("tasks",tasks);
        return "index";
    }

    @RequestMapping("tasks/{id}")
    public String closeTask(@PathVariable int id){
        taskRepository.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping("newTask")
    public String getTaskForm(){
        return "taskForm";
    }

    @PostMapping("/processForm")
    public String addTask(@ModelAttribute Task task){
        taskRepository.save(task);
        return "redirect:/";
    }



}
