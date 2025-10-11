package com.study.cp.factory.factory;

import com.study.cp.factory.product.PaymentGateway;

import java.util.Scanner;

//抽象工厂
public abstract class PaymentGatewayFactory {
    // 这是核心的“工厂方法”，由子类去实现
    //createPaymentGateway(); 并不是在定义一个“接口类型的抽象类”。

    //它实际上是在一个抽象类（或接口）中定义了一个抽象方法。
    // 这个方法的特殊之处在于它的返回类型是一个接口 (PaymentGateway)。
    public abstract PaymentGateway createPaymentGateway();

    /**
     * 这是一个使用工厂方法的业务逻辑示例。
     * 客户端不直接调用 createPaymentGateway()，而是调用这个流程方法。
     * 这使得我们可以在创建前后加入通用逻辑，如日志、权限检查等。
     */
    //创建支付方法
    public void executePayment(double amount) {
        System.out.println("--- 开始处理支付流程 ---");
        PaymentGateway gateway = createPaymentGateway(); // 使用工厂方法创建虚拟产品
        gateway.processPayment(amount);
        System.out.println("--- 支付流程处理完毕 ---");
    }
    //创建存入方法
    public void changePayment(){
        System.out.println("--- 请输入你想存入的金额 ---");
        Scanner scanner1 = new Scanner(System.in);
        double now = scanner1.nextDouble();
        System.out.println("--- 请输入你的余额 ---");
        Scanner scanner2 = new Scanner(System.in);
        double history =scanner2.nextDouble();
        PaymentGateway gateway = createPaymentGateway();
        gateway.accountPayment(now, history);
    }
}
