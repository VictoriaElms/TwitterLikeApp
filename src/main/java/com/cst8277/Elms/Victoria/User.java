package com.cst8277.Elms.Victoria;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name= "user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer userid;
    String name;
    String username;
    String password;
    String email;
    String role;

}
