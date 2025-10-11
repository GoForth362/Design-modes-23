package com.study.cp.factory_abstract.product.Linux;

import com.study.cp.factory_abstract.product.File;

public class LiunxFile implements File {
    @Override
    public void paint() {
        System.out.println("渲染一个 linux 风格的文本");
    }
}
