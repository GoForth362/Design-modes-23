package com.study.CP.Factory_abstract.product.Linux;

import com.study.CP.Factory_abstract.product.Checkbox;

public class LiunxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("渲染一个 linux 风格的复选框");
    }
}
