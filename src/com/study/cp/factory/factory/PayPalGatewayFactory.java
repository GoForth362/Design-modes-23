package com.study.cp.factory.factory;

import com.study.cp.factory.product.PayPalGateway;
import com.study.cp.factory.product.PaymentGateway;

//具体工厂类1
public class PayPalGatewayFactory extends PaymentGatewayFactory {
    @Override
    public PaymentGateway createPaymentGateway() {
        System.out.println("PayPal 工厂正在创建 PayPal 网关...");
        return new PayPalGateway();
    }
}
