package com.study.SP.Adapter;

public class Main {
    public static void main(String[] args) {
        // 1. 模拟从遗留系统获取到一个不兼容的数据对象
        LegacyXmlData legacyXmlData = new LegacyXmlData("<data><name>张三</name><age>25</age></data>");

        // 2. 创建一个处理器
        NewSystemProcessor processor = new NewSystemProcessor();

        // 3. 如果直接传递，代码会编译失败，因为类型不匹配
        // processor.process(legacyXmlData); // <-- 错误！

        // 4. 使用适配器进行包装
        System.out.println("\n--- 使用适配器 ---");
        UnifiedData adapter = new XmlDataAdapter(legacyXmlData);

        // 5. 将适配器传递给新系统，新系统可以无缝处理
        processor.process(adapter);
    }
}
