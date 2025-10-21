package com.study.SP.Adapter.exercise1;

public class Main {
    public static void main(String[] args) {
        LogFactory logFactory = new LogAdapter(new NbLoggerImp());
        logFactory.debug("Test", "我将使用牛逼logger打印log");
    }
}
