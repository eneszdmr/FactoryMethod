package com.springDesignPattern.FactoryMethod.dto;

public record PaymentRequest(
        String orderId,
        Double amount,
        String paymentType) {
}
