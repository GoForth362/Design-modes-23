package com.study.CP.Factory.New.product;

public class FileLogger implements ILogger {
    private final String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void log(String message) {
        // 实际应用中会写入文件
        System.out.println("WRITE TO " + filePath + ": " + message);
    }
}
