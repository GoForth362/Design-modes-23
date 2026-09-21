package com.study.CP.Factory.ex.factory;

import com.study.CP.Factory.ex.product.Formatter;

public abstract class DocumentExporter {
//    private final Formatter formatter;

    /*
    在构造函数中调用可覆写方法是 Java 的经典陷阱
    原因是：父类构造函数执行时，子类还没初始化完成。
    如果子类的 createFormatter() 依赖了子类自己的字段，
    就会拿到默认值（null / 0 / false），导致难以排查的 bug。
     */
//    public DocumentExporter(){
//        this.formatter = createFormatter();
//    }

    public abstract Formatter createFormatter();

    //业务方法
    public String export(String content){
        Formatter formatter = createFormatter();
        return formatter.format(content);
    }

}
