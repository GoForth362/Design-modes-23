package com.study.SP.Decorator;

// ConcreteDecoratorB: 糖调料
public class WithSugar extends CoffeeDecorator {
    public WithSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        // 在被装饰咖啡的价格上，加上糖的价格
        return super.getCost() + 1.5;
    }

    @Override
    public String getDescription() {
        // 在被装饰咖啡的描述上，加上糖的描述
        return super.getDescription() + ", 加糖";
    }
}