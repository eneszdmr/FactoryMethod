package com.springDesignPattern.FactoryMethod.factory;

import com.springDesignPattern.FactoryMethod.dto.PaymentRequest;

public interface PaymentFactory {

    String executePayment(PaymentRequest paymentRequest);
}
