package com.study.CP.Factory_abstract.ex.product.Light;

import com.study.CP.Factory_abstract.ex.product.Button;

public class LightButton extends Button {

    public LightButton(String text) {
        super(text, "light");
    }

    @Override
    public String render() {
        return "Render light button with text " + text;
    }



}
