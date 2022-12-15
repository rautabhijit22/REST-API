package com.springboot.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {

    //GET HTTP Method
    //http://localhost:8080/Hello-World
    @GetMapping("/Hello-World")
    public String helloWorld(){
        return "Hello WOrld!";
    }
}
