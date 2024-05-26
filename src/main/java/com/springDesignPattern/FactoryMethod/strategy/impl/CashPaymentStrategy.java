package com.springDesignPattern.FactoryMethod.strategy.impl;

import com.springDesignPattern.FactoryMethod.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("cash")
public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "payment done with cash the amount is " + amount;
    }
}
