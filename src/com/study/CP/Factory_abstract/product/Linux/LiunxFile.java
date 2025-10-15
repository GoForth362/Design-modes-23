package com.study.CP.Factory_abstract.product.Linux;

import com.study.CP.Factory_abstract.product.File;

public class LiunxFile implements File {
    @Override
    public void paint() {
        System.out.println("渲染一个 linux 风格的文本");
    }
}
