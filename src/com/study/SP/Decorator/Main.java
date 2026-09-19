package com.study.SP.Decorator;

public class Main {
    public static void main(String[] args) {
        // 1. 我们先点一杯最基础的纯咖啡
        Coffee myCoffee = new SimpleCoffee();
        System.out.println("订单1: " + myCoffee.getDescription());
        System.out.println("价格1: " + myCoffee.getCost());
        System.out.println("--------------------");

        // 2. 现在，我们想给这杯咖啡加点牛奶
        // 用 WithMilk 装饰器包装它
        myCoffee = new WithMilk(myCoffee);
        System.out.println("订单2: " + myCoffee.getDescription());
        System.out.println("价格2: " + myCoffee.getCost());
        System.out.println("--------------------");

        // 3. 在加了牛奶的基础上，我们还想加点糖
        // 再用 WithSugar 装饰器包装它
        myCoffee = new WithSugar(myCoffee);
        System.out.println("订单3: " + myCoffee.getDescription());
        System.out.println("价格3: " + myCoffee.getCost());
        System.out.println("--------------------");

        // 4. 点一杯只加糖的咖啡
        Coffee anotherCoffee = new WithSugar(new SimpleCoffee());
        System.out.println("订单4: " + anotherCoffee.getDescription());
        System.out.println("价格4: " + anotherCoffee.getCost());
    }
}
