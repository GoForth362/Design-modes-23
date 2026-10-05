package com.study.SP.Decorator.New.Middleware;

public class BusinessHandler implements Handler{
    @Override
    public void handle(Request request, Response response) {
        System.out.println(">>> Entering BusinessHandler...");
        // 模拟业务逻辑
        if ("/api/user".equals(request.getPath())) {
            response.setStatusCode(200);
            response.setBody("{ \"name\": \"Alice\", \"email\": \"alice@example.com\" }");
        } else {
            response.setStatusCode(404);
            response.setBody("Not Found");
        }
        System.out.println("Business logic finished.");
        System.out.println("<<< Exiting BusinessHandler...");
    }
}
