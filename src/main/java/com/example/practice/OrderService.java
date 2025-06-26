package com.example.practice;

public class OrderService {
    private PayementService paymentService;
    public OrderService(PayementService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(100);
    }
}
