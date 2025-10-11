package com.study.cp.factory_abstract.product.Windows;

import com.study.cp.factory_abstract.product.Checkbox;

// 5. 具体产品B1 (Windows)
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("渲染一个 Windows 风格的复选框");
    }
}
