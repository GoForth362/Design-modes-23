package com.study.CP.Factory.ex.factory;

import com.study.CP.Factory.ex.product.Formatter;
import com.study.CP.Factory.ex.product.MarkdownFormatter;

public class MarkdownExporter extends DocumentExporter {
    @Override
    public Formatter createFormatter() {
        return new MarkdownFormatter();
    }
}
