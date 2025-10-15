package com.study.CP.Factory_abstract.product.Linux;

import com.study.CP.Factory_abstract.product.Button;

public class LiunxButton implements Button {
    @Override
    public void paint() {
        System.out.println("渲染一个 linux 风格的按钮");
    }
}
