package com.springserver.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
public class DemoController {

    @GetMapping("/message")
    public String message() {
        return "Welcome to Spring Boot Embedded Built-in Servers";
    }
}
