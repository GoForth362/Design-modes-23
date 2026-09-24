package com.study.CP.Factory.New.product;

public class RemoteLogger implements ILogger {
    private final String remoteServer;

    public RemoteLogger(String remoteServer) {
        this.remoteServer = remoteServer;
    }

    @Override
    public void log(String message) {
        // 实际应用中会收集系统信息并序列化为 JSON，发送到远程服务器
        String payload = "{\"message\":\"" + message + "\",\"timestamp\":\"" + System.currentTimeMillis() + "\"}";
        System.out.println("SEND TO " + remoteServer + ": " + payload);
    }
}
