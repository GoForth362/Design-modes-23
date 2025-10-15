package com.study.CP.Factory_abstract.factory;

import com.study.CP.Factory_abstract.product.Button;
import com.study.CP.Factory_abstract.product.Checkbox;
import com.study.CP.Factory_abstract.product.File;
import com.study.CP.Factory_abstract.product.Linux.LiunxButton;
import com.study.CP.Factory_abstract.product.Linux.LiunxCheckbox;
import com.study.CP.Factory_abstract.product.Linux.LiunxFile;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LiunxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LiunxCheckbox();
    }

    @Override
    public File createFile() {
        return new LiunxFile();
    }
}
