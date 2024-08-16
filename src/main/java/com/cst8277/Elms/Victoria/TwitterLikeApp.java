package com.cst8277.Elms.Victoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
//@ComponentScan(basePackages="com.cst8277.Elms.Victoria")
@RestController
class TwitterLikeApp {

    public static void main(String[] args){
        SpringApplication.run(TwitterLikeApp.class, args);
    }


    @Controller
    public class WebController {
        @RequestMapping("/")
        public String index(){
            return "index";
        }
    }


}
