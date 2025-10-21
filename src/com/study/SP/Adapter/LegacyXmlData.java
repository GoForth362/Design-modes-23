package com.study.SP.Adapter;

// 被适配者：遗留系统返回的、接口不兼容的数据类
public class LegacyXmlData {
    private String xmlContent;

    public LegacyXmlData(String xmlContent) {
        this.xmlContent = xmlContent;
        System.out.println("成功接收到遗留系统的XML数据: " + xmlContent);
    }

    // 遗留系统特有的获取数据的方法
    public String getElementValue(String elementName) {
        // 实际场景中会解析复杂的XML，这里做简化模拟
        if ("name".equals(elementName)) {
            return "张三";
        }
        if ("age".equals(elementName)) {
            return "25"; // 注意，返回的是字符串
        }
        return null;
    }
}
