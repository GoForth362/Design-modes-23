package com.study.CP.Factory_abstract.New.product.Mac;

import com.study.CP.Factory_abstract.New.product.ICheckbox;

public class MacCheckbox implements ICheckbox {
    @Override
    public void render() {
        System.out.println("Render Mac Checkbox");
    }
}
