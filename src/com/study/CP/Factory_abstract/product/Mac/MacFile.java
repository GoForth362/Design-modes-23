package com.study.CP.Factory_abstract.product.Mac;

import com.study.CP.Factory_abstract.product.File;

public class MacFile implements File {
    @Override
    public void paint() {
        System.out.println("渲染一个 macOS 风格的文本");
    }
}
