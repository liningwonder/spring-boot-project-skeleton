package com.datafusion.iam.controller;

import com.datafusion.iam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return userService.getUserById(1L);
    }

}
