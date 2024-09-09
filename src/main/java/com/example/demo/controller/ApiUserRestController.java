package com.example.demo.controller;

import com.example.demo.dto.ApiUserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

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
