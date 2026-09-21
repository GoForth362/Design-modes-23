package com.study.CP.Factory_abstract.ex.factory;

import com.study.CP.Factory_abstract.ex.product.Button;
import com.study.CP.Factory_abstract.ex.product.Checkbox;
import com.study.CP.Factory_abstract.ex.product.Light.LightButton;
import com.study.CP.Factory_abstract.ex.product.Light.LightCheckbox;

public class LightThemeFactory extends ThemeFactory{
    @Override
    public Button createButton(String text) {
        return new LightButton(text);
    }

    @Override
    public Checkbox createCheckbox(String label) {
        return new LightCheckbox(label);
    }

    @Override
    public String getTheme() {
        return "light";
    }
}
