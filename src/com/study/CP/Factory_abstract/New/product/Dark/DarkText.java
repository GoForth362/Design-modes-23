package com.study.CP.Factory_abstract.New.product.Dark;

import com.study.CP.Factory_abstract.New.product.IText;

public class DarkText implements IText {
    @Override
    public void render() {
        System.out.println("Render Dark Text");
    }
}
