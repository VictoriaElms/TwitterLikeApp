package com.cst8277.Elms.Victoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
   @Autowired
    private UserManagementService userManagementService;

    @PostMapping("/")
    public ResponseEntity<String> loginUser(@RequestParam Integer userId){
        User user= userRepository.findById(userId);
    }
}
