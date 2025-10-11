package com.study.cp.factory.factory;

import com.study.cp.factory.product.CreditCardGateway;
import com.study.cp.factory.product.PaymentGateway;

public class CreditCardGatewayFactory extends PaymentGatewayFactory {
    @Override
    public PaymentGateway createPaymentGateway() {
        System.out.println("信用卡工厂正在创建信用卡网关...");
        return new CreditCardGateway();
    }
}
