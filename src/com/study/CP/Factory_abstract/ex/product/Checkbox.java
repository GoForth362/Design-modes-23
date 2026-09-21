package com.study.CP.Factory_abstract.ex.product;

public abstract class Checkbox {
    protected String label;
    protected String theme;

    public Checkbox(String label, String theme) {
        this.label = label;
        this.theme = theme;
    }

    public abstract String render();

    public String getTheme() {
        return theme;
    }
}
