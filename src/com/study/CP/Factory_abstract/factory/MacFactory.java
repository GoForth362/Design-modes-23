package com.study.CP.Factory_abstract.factory;

import com.study.CP.Factory_abstract.product.Button;
import com.study.CP.Factory_abstract.product.Checkbox;
import com.study.CP.Factory_abstract.product.File;
import com.study.CP.Factory_abstract.product.Mac.MacButton;
import com.study.CP.Factory_abstract.product.Mac.MacCheckbox;
import com.study.CP.Factory_abstract.product.Mac.MacFile;

// 9. 具体工厂2 (macOS)
// 具体工厂2: 负责创建 macOS 风格的所有组件
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }

    @Override
    public File createFile() {
        return new MacFile();
    }
}
