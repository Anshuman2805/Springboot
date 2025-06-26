package com.example.practice;

public class StripePayementService implements PayementService {
    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("Amount" + amount);
    }
}
