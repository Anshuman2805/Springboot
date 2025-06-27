package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    private PayementService paymentService;
    @Autowired
    public OrderService(PayementService paymentService) {
        System.out.println("OrderService constructor");
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(100);
    }
}
