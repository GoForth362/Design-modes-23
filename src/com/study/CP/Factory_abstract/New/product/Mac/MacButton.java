package com.study.CP.Factory_abstract.New.product.Mac;
import com.study.CP.Factory_abstract.New.product.IButton;


public class MacButton implements IButton {
    @Override
    public void render() {
        System.out.println("Render Mac Button");
    }
}
