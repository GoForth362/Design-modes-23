package com.study.CP.Factory_abstract.ex.factory;

import com.study.CP.Factory_abstract.ex.product.Checkbox;
import com.study.CP.Factory_abstract.ex.product.Button;

public abstract class ThemeFactory {
    public abstract Button createButton(String text);
    public abstract Checkbox createCheckbox(String label);
    public abstract String getTheme();

    //可有可无，方便好调用
    public static ThemeFactory createFactory(String theme) {
        if ("dark".equals(theme)) {
            return new DarkThemeFactory();
        } else if ("light".equals(theme)) {
            return new LightThemeFactory();
        } else {
            throw new IllegalArgumentException("Unknown theme: " + theme);
        }
    }
}
