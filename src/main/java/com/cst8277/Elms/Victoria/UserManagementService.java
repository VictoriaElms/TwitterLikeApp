package com.cst8277.Elms.Victoria;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import com.cst8277.Elms.Victoria.UserController;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserManagementService {
    @Autowired
    private UserRepository userRepository;

    public String createToken(User userId){
        String token = UUID.randomUUID().toString();
        LocalDateTime expirationTime = LocalDateTime.now().plusMinutes(15);

        userId.setToken(token);
        userId.setTokenExpirationTime(expirationTime);

        userRepository.save(userId);

        return null;
    }
    public User validateToken(String token){
        User user = userRepository.findByToken(token);
        if (user != null && user.getTokenExpirationTime(). isAfter(LocalDateTime.now()))
        { return user;
        } else{
            return null;
        }
    }








}

