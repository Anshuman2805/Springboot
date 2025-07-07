package com.example.practice;

import com.example.practice.entities.Address;
import com.example.practice.entities.Profile;
import com.example.practice.entities.Tag;
import com.example.practice.entities.User;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        //ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder()
                .name("John")
                .email("<EMAIL>")
                .password("<PASSWORD>")
                .build();

        var profile = Profile.builder()
                .bio("bio")
                .build();

        user.setProfile(profile);
        profile.setUser(user);
        System.out.println(user);
    }

}
