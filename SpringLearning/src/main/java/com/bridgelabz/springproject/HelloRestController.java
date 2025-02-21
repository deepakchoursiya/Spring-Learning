package com.bridgelabz.springproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping("/")
    public String index() {
        return "Hello from BridgeLabz";
    }

    // New method to handle dynamic name in URL
    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name+"!";
}
}