package com.study.SP.Adapter.exercise2;

//这是现在最先进的类，但里面我想用的功能，方法叫做specificRequest()，
//我们不能修改Adaptee类中的源代码
//问题：我如何才能让用习惯了Target接口的朋友，无感的用Adaptee类中的specificRequest()方法呢？
public class Adaptee {
    public void specificRequest(){
        System.out.println("成功调用了新的类方法");
    }
}
