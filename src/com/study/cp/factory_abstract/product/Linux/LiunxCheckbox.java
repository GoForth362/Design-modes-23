package com.study.cp.factory_abstract.product.Linux;

import com.study.cp.factory_abstract.product.Checkbox;

public class LiunxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("渲染一个 linux 风格的复选框");
    }
}
