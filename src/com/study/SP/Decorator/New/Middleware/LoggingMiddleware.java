package com.study.SP.Decorator.New.Middleware;

// 装饰器：日志中间件
public class LoggingMiddleware implements Handler {
    private final Handler next;

    public LoggingMiddleware(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request, Response response) {
        System.out.println(">>> Entering LoggingMiddleware...");
        System.out.println("Request received: " + request.getPath());

        // 将请求传递给下一个处理器
        this.next.handle(request, response);

        System.out.println("Response sent with status: " + response.getStatusCode());
        System.out.println("<<< Exiting LoggingMiddleware...");
    }
}
