package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String CourseAdd(@RequestBody Course c){
        System.out.println(c.getCoursetitle().toString());
        System.out.println(c.getDate().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getVenue().toString());
        return "course added successfully";
    }
    @GetMapping("/view")
    public String CourseView(){
        return "course view page";
    }
}
