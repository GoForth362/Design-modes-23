package com.study.CP.Factory_abstract.New.product.Dark;

import com.study.CP.Factory_abstract.New.product.ICheckbox;

public class DarkCheckbox implements ICheckbox {
    @Override
    public void render() {
        System.out.println("Render Dark Checkbox");
    }
}
