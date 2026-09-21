package com.study.CP.Factory_abstract.ex.product.Light;

import com.study.CP.Factory_abstract.ex.product.Checkbox;

public class LightCheckbox extends Checkbox {
    public LightCheckbox(String label) {
        super(label, "light");
    }
    @Override
    public String render() {
        return "Render light checkbox with label " + label;
    }
}
