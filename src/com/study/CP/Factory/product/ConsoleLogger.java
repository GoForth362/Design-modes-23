package com.study.CP.Factory.product;

public class ConsoleLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("CONSOLE: " + message);
    }
}
