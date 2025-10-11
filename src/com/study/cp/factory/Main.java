package com.study.cp.factory;

import com.study.cp.factory.factory.CreditCardGatewayFactory;
import com.study.cp.factory.factory.PayPalGatewayFactory;
import com.study.cp.factory.factory.PaymentGatewayFactory;

public class Main {
    public static void main(String[] args) {
        // 模拟从配置文件或用户选择中获取支付方式
        String paymentMethod = "PayPal"; // 可以改成 "CreditCard" 试试

        PaymentGatewayFactory factory;

        // 客户端根据不同的条件选择不同的工厂
        if ("PayPal".equalsIgnoreCase(paymentMethod)) {
            factory = new PayPalGatewayFactory();
        } else if ("CreditCard".equalsIgnoreCase(paymentMethod)) {
            factory = new CreditCardGatewayFactory();
        } else {
            throw new IllegalArgumentException("未知的支付方式");
        }

        // 客户端调用统一的业务方法，无需关心具体实现
        //调用父类的方法
        factory.executePayment(199.99);
        factory.changePayment();
    }
}