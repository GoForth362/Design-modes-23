package com.study.CP.Factory_abstract.New.factory;

import com.study.CP.Factory_abstract.New.product.IButton;
import com.study.CP.Factory_abstract.New.product.ICheckbox;
import com.study.CP.Factory_abstract.New.product.IText;

public interface IThemeFactory {
    IButton createButton();
    ICheckbox createCheckbox();
    IText createText();
}
