package com.rest.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/student/")
public class StudentController {

    @Value("${app.name}")
    private String appName;

    @GetMapping("/get")
    public String getStudent() {
        return appName;
    }


}
