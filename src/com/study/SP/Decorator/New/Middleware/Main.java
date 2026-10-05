package com.study.SP.Decorator.New.Middleware;

public class Main {
    public static void main(String[] args) {
        // 1. 核心业务处理器
        Handler businessHandler = new BusinessHandler();
        // 2. 用认证中间件装饰业务处理器
        Handler authMiddleware = new AuthenticationMiddleware(businessHandler);
        // 3. 用日志中间件装饰认证中间件
        Handler handlerChain = new LoggingMiddleware(authMiddleware);

        // 调用顺序：LoggingMiddleware -> AuthenticationMiddleware -> BusinessHandler

        // 认证成功的请求
        Request successfulRequest = new Request("/api/user");
        successfulRequest.addHeader("Authorization", "valid-token");
        Response response1 = new Response();
        handlerChain.handle(successfulRequest, response1);
        System.out.println("Final Response: " + response1);

        System.out.println();

        // 认证失败的请求
        Request failedRequest = new Request("/api/user");
        failedRequest.addHeader("Authorization", "invalid-token");
        Response response2 = new Response();
        handlerChain.handle(failedRequest, response2);
        System.out.println("Final Response: " + response2);
    }
}
