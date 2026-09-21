package com.study.CP.Factory.ex.product;

public class MarkdownFormatter implements Formatter {
    @Override
    public String format(String content) {
        return "**" + content + "**";
    }
}
