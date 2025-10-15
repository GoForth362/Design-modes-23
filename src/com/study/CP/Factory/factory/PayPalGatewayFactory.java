package com.study.CP.Factory.factory;

import com.study.CP.Factory.product.PayPalGateway;
import com.study.CP.Factory.product.PaymentGateway;

//具体工厂类1
public class PayPalGatewayFactory extends PaymentGatewayFactory {
    @Override
    public PaymentGateway createPaymentGateway() {
        System.out.println("PayPal 工厂正在创建 PayPal 网关...");
        return new PayPalGateway();
    }
}
