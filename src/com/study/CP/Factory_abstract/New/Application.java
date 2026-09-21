package com.study.CP.Factory_abstract.New;

import com.study.CP.Factory_abstract.New.factory.DarkThemeFactory;
import com.study.CP.Factory_abstract.New.factory.IThemeFactory;
import com.study.CP.Factory_abstract.New.factory.LightThemeFactory;
import com.study.CP.Factory_abstract.New.product.IButton;
import com.study.CP.Factory_abstract.New.product.ICheckbox;
import com.study.CP.Factory_abstract.New.product.IText;

public class Application {
    private final IButton button;
    private final ICheckbox checkbox;
    private final IText text;

    public Application(IThemeFactory themeFactory) {
        this.button = themeFactory.createButton();
        this.checkbox = themeFactory.createCheckbox();
        this.text = themeFactory.createText();
    }

    public void start() {
        button.render();
        checkbox.render();
        text.render();
    }

    public static void main(String[] args) {
        Application darkApp = new Application(new DarkThemeFactory());
        darkApp.start();
        // 输出 Render Dark Button / Checkbox / Text

        Application lightApp = new Application(new LightThemeFactory());
        lightApp.start();
        // 输出 Render Light Button / Checkbox / Text
    }
}
