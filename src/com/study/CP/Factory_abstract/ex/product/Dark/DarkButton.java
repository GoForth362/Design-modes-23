package com.study.CP.Factory_abstract.ex.product.Dark;

import com.study.CP.Factory_abstract.ex.product.Button;

public class DarkButton extends Button {

    public DarkButton(String text) {
        super(text, "dark");
    }

    @Override
    public String render() {
        return "Render dark button with text " + text;
    }
}
