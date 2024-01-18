package com.joel.br.Parkapi.controller;

import com.joel.br.Parkapi.DTO.UserPasswordDTO;
import com.joel.br.Parkapi.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/change-password")
@AllArgsConstructor
public class UserPasswordController {


    private final UserService service;





    @PostMapping
    public ResponseEntity<UserPasswordDTO> changePass(@PathVariable Long id, @RequestBody UserPasswordDTO userPasswordDTO) {
        return ResponseEntity.ok().body(service.updatePassword(id,userPasswordDTO));
    }
}
