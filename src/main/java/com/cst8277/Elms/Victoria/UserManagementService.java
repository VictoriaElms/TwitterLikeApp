package com.cst8277.Elms.Victoria;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;


@Service
@Transactional
public class UserManagementService {
    @Autowired
    private UserRepository userRepository;
/**
 * Creates and stores a new authentication token for a user
   * @param user the user to create a token for
   * @return the generated token
    */
    public String createToken(User user){
        String token = UUID.randomUUID().toString();
        LocalDateTime expirationTime = LocalDateTime.now().plusMinutes(15);

        user.setToken(token);
        user.setTokenExpirationTime(expirationTime);

        userRepository.save(user);


        return token;
    }


    public Optional<User> validateToken(String token){
        return userRepository.findByToken(token)
                .filter(user -> user.getTokenExpirationTime().isAfter(LocalDateTime.now()));
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
}
}









