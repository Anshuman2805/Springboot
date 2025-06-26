package com.example.practice;

import org.springframework.stereotype.Service;

@Service ("paypal")
public class PayPalPaymentService implements PayementService{
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }
}
