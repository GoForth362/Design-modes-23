package com.study.CP.Builder;

public class Main {
    public static void main(String[] args) {

        // 场景1：创建一个简单的 GET 请求，只提供必需的 URL
        System.out.println(">>> 场景1：简单的 GET 请求");
        HttpRequest simpleGetRequest = new HttpRequest.Builder("https://api.example.com/users/123")
                .build();
        simpleGetRequest.send();


        // 场景2：创建一个复杂的 POST 请求，包含各种可选参数
        System.out.println(">>> 场景2：复杂的 POST 请求");
        String jsonData = "{\"name\":\"John Doe\",\"email\":\"john.doe@example.com\"}";

        HttpRequest complexPostRequest = new HttpRequest.Builder("https://api.example.com/users")
                .method("POST") // 设置请求方法
                .addHeader("Content-Type", "application/json") // 添加请求头
                .addHeader("Authorization", "Bearer your_auth_token") // 添加另一个请求头
                .body(jsonData) // 设置请求体
                .timeout(5000) // 设置超时时间
                .build();
        complexPostRequest.send();


        // 场景3：创建一个带自定义 User-Agent 的 PUT 请求
        System.out.println(">>> 场景3：带自定义 User-Agent 的 PUT 请求");
        HttpRequest putRequest = new HttpRequest.Builder("https://api.example.com/items/456")
                .method("PUT")
                .addHeader("User-Agent", "MyAwesomeApp/1.0")
                .body("{\"status\":\"updated\"}")
                .build(); // 使用默认超时
        putRequest.send();

    }
}
