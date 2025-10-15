package com.study.CP.Factory.product;

//具体产品2
public class CreditCardGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("使用信用卡支付 $" + amount);
        // 此处应包含验证卡号、有效期、CVC等的复杂逻辑
        System.out.println("信用卡支付成功！");
    }

    @Override
    public void accountPayment(double now, double history) {
        double sum;
        sum = now + history;
        System.out.println("存入的金额 $" + now);
        // 此处应包含验证卡号、有效期、CVC等的复杂逻辑
        System.out.println("信用卡存入成功！当前余额" + sum);
    }
}
