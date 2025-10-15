package com.study.CP.Singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("程序启动...");

        // 模块A需要读取配置
        System.out.println("\n模块 A 开始工作...");
        //getInstance()的作用就和 new 一个实体对象样
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        String appName = configManager1.getProperty("app.name");
        String dbUser = configManager1.getProperty("db.user");
        System.out.println("模块 A 读取到应用名称: " + appName);
        System.out.println("模块 A 读取到数据库用户: " + dbUser);

        // 模块B也需要读取配置
        System.out.println("\n模块 B 开始工作...");
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();
        String appVersion = configManager2.getProperty("app.version");
        System.out.println("模块 B 读取到应用版本: " + appVersion);

        // 验证两个模块获取的是否是同一个实例
        System.out.println("\n--- 验证实例唯一性 ---");
        System.out.println("configManager1 的哈希码: " + configManager1.hashCode());
        System.out.println("configManager2 的哈希码: " + configManager2.hashCode());

        //使用 hashCode() 作为一个直观的观察指标是非常好的，但用于程序逻辑判断时，应该始终使用 == 运算符来验证两个引用是否指向同一个实例
        if (configManager1 == configManager2) {
            System.out.println("结论：两个管理者是同一个实例，单例模式工作正常！");
        } else {
            System.out.println("错误：创建了多个实例，单例模式实现失败！");
        }
    }
}

