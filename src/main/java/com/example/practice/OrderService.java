package com.example.practice;

public class OrderService {
    public void placeOrder(){
        var paymentService = new StripePayementService();
        paymentService.processPayment(100);
    }
}
