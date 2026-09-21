package com.study.CP.Factory.ex.factory;

import com.study.CP.Factory.ex.product.Formatter;
import com.study.CP.Factory.ex.product.PlainFormatter;

public class PlainExporter extends DocumentExporter{
    @Override
    public Formatter createFormatter() {
        return new PlainFormatter();
    }
}
