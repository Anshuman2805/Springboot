package com.example.practice;

import com.example.practice.entities.User;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        //ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = new User();
        user.setName("test");
        user.setEmail("<EMAIL>");
        user.setPassword("<PASSWORD>");
    }

}
