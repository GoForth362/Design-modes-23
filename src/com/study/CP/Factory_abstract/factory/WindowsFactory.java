package com.study.CP.Factory_abstract.factory;

import com.study.CP.Factory_abstract.product.Button;
import com.study.CP.Factory_abstract.product.Checkbox;
import com.study.CP.Factory_abstract.product.File;
import com.study.CP.Factory_abstract.product.Windows.WindowsButton;
import com.study.CP.Factory_abstract.product.Windows.WindowsCheckbox;
import com.study.CP.Factory_abstract.product.Windows.WindowsFile;

//8. 具体工厂1 (Windows)
// 具体工厂1: 负责创建 Windows 风格的所有组件
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public File createFile() {
        return new WindowsFile();
    }
}
