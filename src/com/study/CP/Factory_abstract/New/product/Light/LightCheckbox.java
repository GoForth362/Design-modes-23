package com.study.CP.Factory_abstract.New.product.Light;

import com.study.CP.Factory_abstract.New.product.ICheckbox;

public class LightCheckbox implements ICheckbox {
    @Override
    public void render() {
        System.out.println("Render Light Checkbox");
    }
}
