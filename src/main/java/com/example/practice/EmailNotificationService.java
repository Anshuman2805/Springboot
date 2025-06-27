package com.example.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message){
        System.out.println("Sending Email: " + message);
    }
}
