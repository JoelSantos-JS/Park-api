package com.joel.br.Parkapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Data
@Table(name = "users")
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 25 , nullable = false)
    private String name;
    @Column(name = "email", length = 205 , nullable = false)
    private String email;

    @Column(name = "password", length = 20, nullable = false)
    private String password;
    @Column(nullable = false , length = 10 , name = "role")
    @Enumerated(EnumType.STRING)
    private Role role = Role.CLIENT;

    @CreatedDate
    private LocalDateTime createDate ;
    @LastModifiedDate
    private LocalDateTime modifiedDate;

    private String createBy;

    private String modifiedBy;
}
