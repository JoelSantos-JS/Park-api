package com.joel.br.Parkapi.controller;

import com.joel.br.Parkapi.DTO.UserRequest;
import com.joel.br.Parkapi.DTO.UserResponse;
import com.joel.br.Parkapi.entity.User;
import com.joel.br.Parkapi.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
@AllArgsConstructor
public class UserController {


    private final UserService service;




    @PostMapping
    public ResponseEntity<UserResponse> createUse(@RequestBody UserRequest user) {
        return  ResponseEntity.ok().body(service.createUser(user));
    }
}
