package com.study.SP.Adapter.exercise2;

public class Main {
    public static void main(String[] args) {
        //使用老方法
        TargetClass targetClass = new TargetClass();
        targetClass.request();

        //使用新方法
        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
