package com.study.SP.Adapter.exercise1;

//下面是第三方库提供的日志功能
//但是其接口与二狗他们系统目前使用的不兼容。
public interface NbLogger {
    void d(int priority, String message, Object ... obj);
}
