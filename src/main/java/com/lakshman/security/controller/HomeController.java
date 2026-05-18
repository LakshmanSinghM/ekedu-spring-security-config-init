package com.lakshman.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Health check done application running fine";
    }

    @GetMapping
    public String home() {
        return "Application running fine";
    }
}