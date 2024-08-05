package com.cst8277.Elms.Victoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public Mono<String> login(@RequestBody Map<String, String> credentials){
        String username = credentials.get("username");
        String password = credentials.get("password");
        userRepository.save(new User(username, password));
        return Mono.empty();
    }

    @GetMapping
    public Mono<Map<UUID, User>> getAllUsers(){
        return Mono.just(userRepository.findAll());
    }

}
