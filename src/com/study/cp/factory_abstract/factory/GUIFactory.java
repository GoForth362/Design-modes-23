package com.study.cp.factory_abstract.factory;

import com.study.cp.factory_abstract.product.Button;
import com.study.cp.factory_abstract.product.Checkbox;
import com.study.cp.factory_abstract.product.File;

// 7. 抽象工厂
// 抽象工厂: 定义了创建一系列相关产品的方法
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    File createFile();
}
