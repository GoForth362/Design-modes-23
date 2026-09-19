package com.study.SP.Decorator;

// Decorator: 抽象装饰器
public abstract class CoffeeDecorator implements Coffee {
    // 内部持有一个被装饰的 Coffee 对象的引用
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    // 默认实现是直接调用被装饰对象的方法
    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
