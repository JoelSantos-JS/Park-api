package com.joel.br.Parkapi.DTO;

import com.joel.br.Parkapi.entity.Role;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequest {


    private String name;
    private String email;

    private String password;

    private Role role;


}
