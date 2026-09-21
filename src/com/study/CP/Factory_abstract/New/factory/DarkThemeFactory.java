package com.study.CP.Factory_abstract.New.factory;

import com.study.CP.Factory_abstract.New.product.Dark.DarkButton;
import com.study.CP.Factory_abstract.New.product.Dark.DarkCheckbox;
import com.study.CP.Factory_abstract.New.product.Dark.DarkText;
import com.study.CP.Factory_abstract.New.product.IButton;
import com.study.CP.Factory_abstract.New.product.ICheckbox;
import com.study.CP.Factory_abstract.New.product.IText;

public class DarkThemeFactory implements IThemeFactory{
    @Override
    public IButton createButton() {
        return new DarkButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new DarkCheckbox();
    }

    @Override
    public IText createText() {
        return new DarkText();
    }
}
