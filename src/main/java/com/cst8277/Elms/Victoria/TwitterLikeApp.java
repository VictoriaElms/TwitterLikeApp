package com.cst8277.Elms.Victoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan(basePackages="com.cst8277.Elms.Victoria")
@RestController
class TwitterLikeApp{
    public static void main(String[] args){
        SpringApplication.run(TwitterLikeApp.class, args);
    }

    @GetMapping("/test")
    public String test() {
        return "Testing";
    }
}
