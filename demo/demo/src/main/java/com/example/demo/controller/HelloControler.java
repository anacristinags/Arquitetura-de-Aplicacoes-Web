package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloControler {
    @GetMapping("/testAnaCristina")
    public String helloWorld() {
        return "Hello, World!";
    }

}
