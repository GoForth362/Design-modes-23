package com.study.cp.factory.product;

//抽象产品
public interface PaymentGateway {
    /**
     * 处理支付
     * @param amount 支付金额
     */
    void processPayment(double amount);

    /**
     * 记账
     * @param now 存入金额
     * @param history 已存金额
     */
    void accountPayment(double now, double history);
}
