package com.example.practice;

import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Sending SMS to " + recipientEmail + ": " + message);
    }
}

