package com.study.cp.factory_abstract.product.Mac;

import com.study.cp.factory_abstract.product.Checkbox;

// 6. 具体产品B2 (macOS)
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("渲染一个 macOS 风格的复选框");
    }
}
