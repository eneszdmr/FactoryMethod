package com.springDesignPattern.FactoryMethod.strategy.impl;

import com.springDesignPattern.FactoryMethod.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "payment done with credit card";
    }
}
