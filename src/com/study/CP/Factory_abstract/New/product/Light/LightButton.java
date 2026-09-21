package com.study.CP.Factory_abstract.New.product.Light;

import com.study.CP.Factory_abstract.New.product.IButton;

public class LightButton implements IButton {
    @Override
    public void render() {
        System.out.println("Render Light Button");
    }
}
