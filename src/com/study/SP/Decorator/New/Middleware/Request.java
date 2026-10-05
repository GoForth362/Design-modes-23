package com.study.SP.Decorator.New.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private final String path;
    private final Map<String, String> headers = new HashMap<>();

    public Request(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    public String getHeader(String key) {
        return headers.get(key);
    }
}
