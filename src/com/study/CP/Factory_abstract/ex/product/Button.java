package com.study.CP.Factory_abstract.ex.product;

public abstract class Button {
    protected String text;
    protected String theme;

    public Button(String text, String theme) {
        this.text = text;
        this.theme = theme;
    }

    public abstract String render();

    public String getTheme() {
        return theme;
    }
}
