package com.study.CP.Factory.ex.product;

public class HtmlFormatter implements Formatter{
    @Override
    public String formatter(String content) {
        return "<p>" + content +"</p>";
    }
}
