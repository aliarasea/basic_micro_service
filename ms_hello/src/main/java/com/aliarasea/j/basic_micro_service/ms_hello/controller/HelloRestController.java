package com.aliarasea.j.basic_micro_service.ms_hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping("/{name}")
    public String say(@PathVariable String name) {
        return String.format("Hello, %s!", name);
    }
}
