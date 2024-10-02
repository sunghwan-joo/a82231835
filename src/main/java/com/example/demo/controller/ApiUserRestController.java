package com.example.demo.controller;

import com.example.demo.dto.ApiUserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiUserRestController {
    
    public ApiUserRestController() {
    }

    @GetMapping("/api/v1/user")
    public ApiUserDto getApiUserId() {
        ApiUserDto user = new ApiUserDto();
        return user;
    }
}
