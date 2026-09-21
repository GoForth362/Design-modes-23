package com.study.CP.Factory.ex.factory;

import com.study.CP.Factory.ex.product.Formatter;
import com.study.CP.Factory.ex.product.HtmlFormatter;

public class HtmlExporter extends DocumentExporter {
    @Override
    public Formatter createFormatter() {
        return new HtmlFormatter();
    }
}
