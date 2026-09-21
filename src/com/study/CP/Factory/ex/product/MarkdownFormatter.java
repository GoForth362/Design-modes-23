package com.study.CP.Factory.ex.product;

public class MarkdownFormatter implements Formatter {
    @Override
    public String formatter(String content) {
        return "**" + content + "**";
    }
}
