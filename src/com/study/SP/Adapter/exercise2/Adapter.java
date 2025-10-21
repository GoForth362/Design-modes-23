package com.study.SP.Adapter.exercise2;

//用老模式调用新方法的类->适配器
//1.在适配器中实现原来的方法
//2.引用最新的方法（把新方法作为属性使用）
//3.在老方法中实现新方法
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void request(){
        adaptee.specificRequest();
    }
}
