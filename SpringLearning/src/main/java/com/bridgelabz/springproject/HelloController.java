package com.bridgelabz.springproject;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String helloWorld() {
        return "Hello form bridgelabz!";
    }
}