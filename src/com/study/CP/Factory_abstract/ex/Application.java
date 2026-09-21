package com.study.CP.Factory_abstract.ex;

import com.study.CP.Factory_abstract.ex.factory.ThemeFactory;
import com.study.CP.Factory_abstract.ex.product.Button;
import com.study.CP.Factory_abstract.ex.product.Checkbox;

public class Application {
    private final String theme;
    private final Button button;
    private final Checkbox checkbox;

    public Application(ThemeFactory themeFactory) {
        this.button = themeFactory.createButton("确定");
        this.checkbox = themeFactory.createCheckbox("记住我");
        this.theme = themeFactory.getTheme();
    }

    public void render() {
        System.out.println("当前主题: " + theme);
        System.out.println(button.render() + "  [theme=" + button.getTheme() + "]");
        System.out.println(checkbox.render() + "  [theme=" + checkbox.getTheme() + "]");
    }

    public static void main(String[] args) {
        Application app = new Application(ThemeFactory.createFactory("dark"));
        app.render();
    }

}
