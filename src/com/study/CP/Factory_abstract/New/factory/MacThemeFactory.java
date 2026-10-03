package com.study.CP.Factory_abstract.New.factory;

import com.study.CP.Factory_abstract.New.product.IButton;
import com.study.CP.Factory_abstract.New.product.ICheckbox;
import com.study.CP.Factory_abstract.New.product.IText;
import com.study.CP.Factory_abstract.New.product.Mac.MacButton;
import com.study.CP.Factory_abstract.New.product.Mac.MacCheckbox;
import com.study.CP.Factory_abstract.New.product.Mac.MacText;

public class MacThemeFactory implements IThemeFactory{
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacCheckbox();
    }

    @Override
    public IText createText() {
        return new MacText();
    }
}
