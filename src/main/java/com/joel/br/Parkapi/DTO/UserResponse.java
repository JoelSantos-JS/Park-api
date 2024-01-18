package com.joel.br.Parkapi.DTO;

import com.joel.br.Parkapi.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponse {


    private String name;
    private String email;

    private Role role;

    private String password;


}
