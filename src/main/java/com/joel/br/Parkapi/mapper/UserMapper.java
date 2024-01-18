package com.joel.br.Parkapi.mapper;

import com.joel.br.Parkapi.DTO.UserRequest;
import com.joel.br.Parkapi.DTO.UserResponse;
import com.joel.br.Parkapi.entity.User;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class UserMapper {


    private final ModelMapper mapper;



    public User toMapper(UserRequest userRequest) {
        return mapper.map(userRequest, User.class);
    }

    public  User toMapper1(UserResponse userResponse) {
        return  mapper.map(userResponse, User.class);
    }


    public UserRequest toUser(User user) {
        return mapper.map(user, UserRequest.class);
    }


    public UserResponse toUse(User user) {
        return  mapper.map(user, UserResponse.class);
    }



}
