package com.example.lab1.controller;

import com.example.lab1.dto.HealthResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @Value("${service.name}")
    private String serviceName;

    @GetMapping("/health")
    public HealthResponse health() {
        return new HealthResponse("UP", serviceName);
    }
}