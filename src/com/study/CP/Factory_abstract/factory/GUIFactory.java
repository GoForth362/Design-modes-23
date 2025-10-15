package com.study.CP.Factory_abstract.factory;

import com.study.CP.Factory_abstract.product.Button;
import com.study.CP.Factory_abstract.product.Checkbox;
import com.study.CP.Factory_abstract.product.File;

// 7. 抽象工厂
// 抽象工厂: 定义了创建一系列相关产品的方法
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    File createFile();
}
