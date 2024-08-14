package com.cst8277.Elms.Victoria;

import jakarta.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name= "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer userid;
    String name;
    String username;
    String password;
    String email;
    String role;
    @Setter
    @Getter
    String token;
    @Setter
    @Getter
    LocalDateTime tokenExpirationTime;


}