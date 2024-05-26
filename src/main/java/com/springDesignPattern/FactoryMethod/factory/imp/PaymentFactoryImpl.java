package com.springDesignPattern.FactoryMethod.factory.imp;

import com.springDesignPattern.FactoryMethod.dto.PaymentRequest;
import com.springDesignPattern.FactoryMethod.factory.PaymentFactory;
import com.springDesignPattern.FactoryMethod.strategy.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentFactoryImpl implements PaymentFactory {

    private final Map<String, PaymentStrategy> paymentStrategyMap;

    public PaymentFactoryImpl(Map<String, PaymentStrategy> paymentStrategyMap) {
        this.paymentStrategyMap = paymentStrategyMap;
    }

    public  PaymentStrategy getPaymentStrategy(String paymentType){
        PaymentStrategy paymentStrategy=paymentStrategyMap.get(paymentType);
        if (paymentType == null){
            throw new IllegalArgumentException("Invalid payment type:" +paymentType);
        }
        return paymentStrategy;
    }

    @Override
    public String executePayment(PaymentRequest paymentRequest) {
        PaymentStrategy paymentStrategy=getPaymentStrategy(paymentRequest.paymentType());
        return paymentStrategy.pay(paymentRequest.orderId(),paymentRequest.amount(),paymentRequest.paymentType());
        
    }
}
