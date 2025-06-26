package com.example.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service ("stripe")
@Primary
public class StripePayementService implements PayementService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.apiKey}")
    private int apiKey;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.supported-currency}")
    private List<String> supportedCurrency;

    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("API URL: " + apiUrl);
        System.out.println("API KEY: " + apiKey);
        System.out.println("Enabled: " + enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Currency: " + supportedCurrency);
        System.out.println("Amount: " + amount);
    }
}
