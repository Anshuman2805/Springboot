package com.example.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service ("stripe")
@Primary
public class StripePayementService implements PayementService {
    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
