package com.study.SP.Adapter;

import java.util.HashMap;
import java.util.Map;

// 适配器：实现了目标接口，并包装了被适配者
public class XmlDataAdapter implements UnifiedData {

    // 内部持有一个被适配者的实例
    private LegacyXmlData legacyData;

    public XmlDataAdapter(LegacyXmlData legacyData) {
        this.legacyData = legacyData;
    }

    // 这是适配器的核心：实现接口转换
    @Override
    public Map<String, Object> getData() {
        System.out.println("适配器开始工作：将 LegacyXmlData 转换为 Map...");
        Map<String, Object> map = new HashMap<>();

        // 调用被适配者的方法获取数据
        String name = legacyData.getElementValue("name");
        String ageStr = legacyData.getElementValue("age");

        // 进行数据转换和处理
        map.put("name", name);
        if (ageStr != null) {
            // 将字符串年龄转换为整数类型，以符合新系统的要求
            map.put("age", Integer.parseInt(ageStr));
        }

        System.out.println("适配器工作完成：转换后的 Map 数据为 " + map);
        return map;
    }
}
