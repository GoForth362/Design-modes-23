package com.study.CP.Factory.ex;

import com.study.CP.Factory.ex.factory.DocumentExporter;
import com.study.CP.Factory.ex.factory.MarkdownExporter;
import com.study.CP.Factory.ex.factory.PlainExporter;

public class Main {
    public static void main(String[] args) {
        System.out.println("PlainFormatter");
        DocumentExporter PE = new PlainExporter();
        String string1 = PE.export("hello");
        System.out.println(string1);

        System.out.println("MarkdownExporter");
        DocumentExporter ME = new MarkdownExporter();
        String string2 = ME.export("hello");
        System.out.println(string2);
    }
}
