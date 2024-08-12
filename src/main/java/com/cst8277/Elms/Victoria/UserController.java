package com.cst8277.Elms.Victoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping( "/add")
    public @ResponseBody String addUser(@RequestParam String username, @RequestParam String password,@RequestParam String role, @RequestParam String email, @RequestParam String name){
        User n = new User();
        n.setUsername(username);
        n.setPassword(password);
        n.setRole(role);
        n.setEmail(email);
        n.setName(name);
    //    userRepository.save(n);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers() {
       return userRepository.findAll();
    }

}
