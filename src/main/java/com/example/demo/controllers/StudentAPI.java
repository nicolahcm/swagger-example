package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentAPI {


    @GetMapping
    public String getStudent() {
        return "hello world! A Get Request has been sent!";
    }



    @PostMapping
    public String postStudent() {
        return " a post request has been sent!";
    }
}
