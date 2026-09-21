package com.study.CP.Factory_abstract.New.factory;

import com.study.CP.Factory_abstract.New.product.*;
import com.study.CP.Factory_abstract.New.product.Light.LightButton;
import com.study.CP.Factory_abstract.New.product.Light.LightCheckbox;
import com.study.CP.Factory_abstract.New.product.Light.LightText;

public class LightThemeFactory implements IThemeFactory{
    @Override
    public IButton createButton() {
        return new LightButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new LightCheckbox();
    }

    @Override
    public IText createText() {
        return new LightText();
    }
}
