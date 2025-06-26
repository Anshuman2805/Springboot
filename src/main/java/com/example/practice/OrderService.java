package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PayementService paymentService;
    @Autowired
    public OrderService(@Qualifier("stripe") PayementService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(100);
    }
}
