package com.study.CP.Factory_abstract.product.Windows;

import com.study.CP.Factory_abstract.product.Button;

//3. 具体产品A1 (Windows)
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("渲染一个 Windows 风格的按钮");
    }
}
