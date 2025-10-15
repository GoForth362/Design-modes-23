package com.study.CP.Factory.factory;

import com.study.CP.Factory.product.CreditCardGateway;
import com.study.CP.Factory.product.PaymentGateway;

public class CreditCardGatewayFactory extends PaymentGatewayFactory {
    @Override
    public PaymentGateway createPaymentGateway() {
        System.out.println("信用卡工厂正在创建信用卡网关...");
        return new CreditCardGateway();
    }
}
