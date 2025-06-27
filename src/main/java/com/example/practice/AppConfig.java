package com.example.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${payment-gateway}")
    private String paymentGateway;

    @Bean
    public PayementService stripe(){
        return new StripePayementService();
    }
    @Bean
    public PayementService paypal(){
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService(){
        if(paymentGateway.equals("stripe")) {
            return new OrderService(stripe());
        }
        else{
            return new OrderService(paypal());
        }
    }
}
