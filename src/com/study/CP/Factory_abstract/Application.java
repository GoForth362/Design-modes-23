package com.study.CP.Factory_abstract;

import com.study.CP.Factory_abstract.factory.GUIFactory;
import com.study.CP.Factory_abstract.product.Button;
import com.study.CP.Factory_abstract.product.Checkbox;
import com.study.CP.Factory_abstract.product.File;

//10. 客户端
// 客户端类
public class  Application {
    private Button button;
    private Checkbox checkbox;
    private File file;

    // 客户端通过构造函数接收一个工厂
    public Application(GUIFactory factory) {
        // 使用传入的工厂来创建组件，不关心具体是哪个工厂
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        file = factory.createFile();
    }

    // 客户端的业务逻辑，与具体的组件风格无关
    public void renderUI() {
        System.out.println("--- 开始渲染UI ---");
        button.paint();
        checkbox.paint();
        file.paint();
        System.out.println("--- UI渲染完毕 ---");
    }
}
