package com.study.CP.Factory_abstract.ex.product.Dark;

import com.study.CP.Factory_abstract.ex.product.Checkbox;

public class DarkCheckbox extends Checkbox {

    public DarkCheckbox(String label) {
        super(label, "dark");
    }
    @Override
    public String render() {
        return "Render dark checkbox with label " + label;
    }
}
