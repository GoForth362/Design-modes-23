package com.study.CP.Factory_abstract.New.product.Mac;

import com.study.CP.Factory_abstract.New.product.IText;

public class MacText implements IText {
    @Override
    public void render() {
        System.out.println("Render Mac Text");
    }
}
