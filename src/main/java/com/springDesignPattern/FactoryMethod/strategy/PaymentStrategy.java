package com.springDesignPattern.FactoryMethod.strategy;

public interface PaymentStrategy {

    String pay(String orderId,Double amount,String paymentType);
}
