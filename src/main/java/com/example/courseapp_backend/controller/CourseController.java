package com.example.courseapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @PostMapping("/add")
    public String CourseAdd(){
        return "course addede successfully";
    }
    @GetMapping("/view")
    public String CourseView(){
        return "course view page";
    }
}
