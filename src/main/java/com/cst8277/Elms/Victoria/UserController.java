package com.cst8277.Elms.Victoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/all")
    public ResponseEntity<String> addUser(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String role,
            @RequestParam String email,
            @RequestParam String name,
            @RequestParam String token,
            @RequestParam("tokenExpiration") String tokenExpirationTime) {

        LocalDateTime parsedTokenExpirationTime;
        try {
            parsedTokenExpirationTime = LocalDateTime.parse(tokenExpirationTime);
        } catch (DateTimeParseException e) {
            return ResponseEntity.badRequest().body("Invalid token expiration time format.");
        }

        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        newUser.setRole(role);
        newUser.setEmail(email);
        newUser.setName(name);
        newUser.setToken(token);
        newUser.setTokenExpirationTime(parsedTokenExpirationTime);

        userRepository.save(newUser);

        return ResponseEntity.ok("User Saved Successfully");
    }
    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}



