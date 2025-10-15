package com.study.CP.Factory_abstract.product.Windows;

import com.study.CP.Factory_abstract.product.File;

public class WindowsFile implements File {
    @Override
    public void paint(){
        System.out.println("渲染一个 Windows 风格的文本");
    }
}
