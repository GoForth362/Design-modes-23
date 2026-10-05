package com.study.SP.Decorator.New.Middleware;

// 装饰器：认证中间件
public class AuthenticationMiddleware implements Handler {
    private final Handler next;

    public AuthenticationMiddleware(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request, Response response) {
        System.out.println(">>> Entering AuthenticationMiddleware...");

        String authToken = request.getHeader("Authorization");
        if ("valid-token".equals(authToken)) {
            System.out.println("Authentication successful. Passing to next handler.");
            // 认证成功，传递给下一个处理器
            this.next.handle(request, response);
        } else {
            // 认证失败，直接返回，不再继续向后传递
            System.out.println("Authentication failed. Stop the request.");
            response.setStatusCode(401);
            response.setBody("Unauthorized");
        }

        System.out.println("<<< Exiting AuthenticationMiddleware...");
    }
}
