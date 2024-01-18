package com.joel.br.Parkapi.repository;

import com.joel.br.Parkapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
