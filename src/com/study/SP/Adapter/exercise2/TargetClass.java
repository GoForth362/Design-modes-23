package com.study.SP.Adapter.exercise2;

public class TargetClass implements Target{
    @Override
    public void request(){
        System.out.println("还在使用老方法");
    }
}
