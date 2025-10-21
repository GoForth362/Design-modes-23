package com.study.SP.Adapter;

// 客户端：只依赖于目标接口
public class NewSystemProcessor {
    public void process(UnifiedData data) {
        System.out.println("新系统正在处理数据...");
        // 客户端代码只与统一的 Map 格式交互，非常整洁
        String name = (String) data.getData().get("name");
        Integer age = (Integer) data.getData().get("age");
        System.out.println("处理完成。姓名: " + name + ", 年龄: " + age);
    }
}
