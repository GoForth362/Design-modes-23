package com.study.SP.Decorator;

// ConcreteComponent: 最基础的咖啡，被装饰的核心
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 10.0; // 一杯纯咖啡10元
    }

    @Override
    public String getDescription() {
        return "纯咖啡";
    }
}
