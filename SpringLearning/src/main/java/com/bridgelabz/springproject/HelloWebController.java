package com.bridgelabz.springproject;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

    @GetMapping("/web")
    public String hello() {
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(@RequestParam(value = "name", defaultValue = "Guest") String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "message";
}
}