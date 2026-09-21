package com.study.CP.Factory_abstract.ex.factory;

import com.study.CP.Factory_abstract.ex.product.Button;
import com.study.CP.Factory_abstract.ex.product.Checkbox;
import com.study.CP.Factory_abstract.ex.product.Dark.DarkButton;
import com.study.CP.Factory_abstract.ex.product.Dark.DarkCheckbox;

public class DarkThemeFactory extends ThemeFactory{
    @Override
    public Button createButton(String text) {
        return new DarkButton(text);
    }

    @Override
    public Checkbox createCheckbox(String label) {
        return new DarkCheckbox(label);
    }

    @Override
    public String getTheme() {
        return "dark";
    }
}
