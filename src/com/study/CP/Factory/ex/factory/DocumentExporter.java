package com.study.CP.Factory.ex.factory;

import com.study.CP.Factory.ex.product.Formatter;

public abstract class DocumentExporter {
    private final Formatter formatter;

    public DocumentExporter(){
        this.formatter = createFormatter();
    }

    public abstract Formatter createFormatter();

    //业务方法
    public String export(String content){
        return formatter.formatter(content);
    }

}
