package com.joel.br.Parkapi.services;

import com.joel.br.Parkapi.DTO.UserRequest;
import com.joel.br.Parkapi.DTO.UserResponse;
import com.joel.br.Parkapi.entity.Role;
import com.joel.br.Parkapi.entity.User;
import com.joel.br.Parkapi.mapper.UserMapper;
import com.joel.br.Parkapi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Service

@AllArgsConstructor
public class UserService {

    private final UserRepository repository;

    private final UserMapper mapper;



    public User findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<User> findAll() {
        return repository.findAll();

    }

    public UserResponse createUser(UserRequest user) {


        User user1= repository.save(mapper.toMapper(user));

        return mapper.toUse(user1);
    }


    public  User updatePassword(Long id, String user){
        User user1 = findById(id);


        user1.setModifiedDate(LocalDateTime.now());
        user1.setPassword(user);



        return user1;
    }


    public User updateUser(Long id, User user) {
        User existentUser= repository.findById(id).get();

        if(existentUser != null) {
            existentUser.setEmail(user.getEmail());
            existentUser.setRole(user.getRole());
            existentUser.setName(user.getName());
            existentUser.setModifiedDate(LocalDateTime.now());


            return repository.save(existentUser);
        } else  {
            return  null;
        }


    }
}
