package com.example.springboot.controller;

import com.example.springboot.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/")
    public String getTasks(Model model){
        List<Task> tasks=new ArrayList<>();
        tasks.add(new Task(1,"task 1", LocalDate.of(2021,01,23)));
        tasks.add(new Task(2,"task 2", LocalDate.of(2021,02,23)));
        tasks.add(new Task(3,"task 3", LocalDate.of(2021,03,23)));
        tasks.add(new Task(4,"task 4", LocalDate.of(2021,04,23)));
        model.addAttribute("tasks",tasks);
        return "index";
    }

}
