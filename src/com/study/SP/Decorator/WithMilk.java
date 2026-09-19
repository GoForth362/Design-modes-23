package com.study.SP.Decorator;

// ConcreteDecoratorA: 牛奶调料
public class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        // 在被装饰咖啡的价格上，加上牛奶的价格
        return super.getCost() + 3.0;
    }

    @Override
    public String getDescription() {
        // 在被装饰咖啡的描述上，加上牛奶的描述
        return super.getDescription() + ", 加牛奶";
    }
}
