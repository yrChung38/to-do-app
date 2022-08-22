package com.example.todoapp.cotroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String Main() {
        return  "Welcome ! todo-application";
    }

}
