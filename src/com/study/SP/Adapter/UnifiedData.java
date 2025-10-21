package com.study.SP.Adapter;

import java.util.Map;

// 目标接口：新系统期望处理的数据格式
public interface UnifiedData {
    Map<String, Object> getData();
}
