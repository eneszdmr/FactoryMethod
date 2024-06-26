package com.springDesignPattern.FactoryMethod.strategy.impl;

import com.springDesignPattern.FactoryMethod.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "payment done with credit card thats all " + orderId + " " + amount + " " + paymentType;
    }
}
