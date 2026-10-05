package com.study.SP.Decorator.New.Middleware;

public class Response {
    private String body;
    private int statusCode;

    public void setBody(String body) { this.body = body; }
    public int getStatusCode() { return statusCode; }
    public void setStatusCode(int statusCode) { this.statusCode = statusCode; }

    @Override
    public String toString() {
        return "Response [statusCode=" + statusCode + ", body='" + body + "']";
    }
}
