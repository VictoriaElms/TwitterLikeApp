package com.cst8277.Elms.Victoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserManagementService userManagementService;

    /**
     * Endpoint to handle user login requests
     * Assumes that user identification is done by the username
     * @param username the username of the user trying to log in
     * @param password the password of the user trying to log in
     * @return the token if login is successful, otherwise an unauthorized error will occur
    */
     @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password){
        Optional<User> userOptional = userManagementService.findByUsername(username);
        if(!userOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        User user = userOptional.get();

        if(!user.getPassword().equals(password)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
         }
        String token = userManagementService.createToken(user);
        return ResponseEntity.ok(token);
    }
}
