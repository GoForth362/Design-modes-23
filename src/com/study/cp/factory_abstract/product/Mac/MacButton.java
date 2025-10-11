package com.study.cp.factory_abstract.product.Mac;

import com.study.cp.factory_abstract.product.Button;

// 4. 具体产品A2 (macOS)
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("渲染一个 macOS 风格的按钮");
    }
}
