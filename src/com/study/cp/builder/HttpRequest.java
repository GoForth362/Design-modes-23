package com.study.cp.builder;

import java.util.HashMap;
import java.util.Map;
/**
 * 产品类 (Product): HttpRequest
 * 这是一个不可变类，一旦通过 Builder 创建，其内容就不能被修改。
 */
public final class HttpRequest {

    private final String url;
    private final String method;
    private final Map<String, String> headers;
    private final String body;
    private final int timeout; // in milliseconds

    // 构造函数是私有的，只能通过 Builder 调用
    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.body = builder.body;
        this.timeout = builder.timeout;
    }

    // 模拟发送请求
    public void send() {
        System.out.println("--- 准备发送请求 ---");
        System.out.println("URL: " + url);
        System.out.println("Method: " + method);
        System.out.println("Timeout: " + timeout + "ms");
        if (!headers.isEmpty()) {
            System.out.println("Headers: " + headers);
        }
        if (body != null && !body.isEmpty()) {
            System.out.println("Body: " + body);
        }
        System.out.println("...请求已发送（模拟）...\n");
    }


    /**
     * 建造者 (Builder)
     * 作为 HttpRequest 的一个静态内部类。
     */
    public static class Builder {
        // 必需参数
        private final String url;

        // 可选参数 - 提供默认值
        private String method = "GET";
        private Map<String, String> headers = new HashMap<>();
        private String body = null;
        private int timeout = 10000; // 默认10秒

        // Builder 的构造函数只接收必需参数
        public Builder(String url) {
            if (url == null || url.trim().isEmpty()) {
                throw new IllegalArgumentException("URL cannot be null or empty.");
            }
            this.url = url;
        }

        // 为可选参数提供链式调用方法
        public Builder method(String method) {
            this.method = method.toUpperCase();
            return this;
        }

        public Builder addHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder timeout(int milliseconds) {
            this.timeout = milliseconds;
            return this;
        }

        // 最终的 build 方法，返回一个完整的、不可变的 HttpRequest 对象
        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }
}
