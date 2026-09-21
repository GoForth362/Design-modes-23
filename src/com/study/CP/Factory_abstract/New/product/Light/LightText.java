package com.study.CP.Factory_abstract.New.product.Light;

import com.study.CP.Factory_abstract.New.product.IText;

public class LightText implements IText {
    @Override
    public void render() {
        System.out.println("Render Light Text");
    }
}
