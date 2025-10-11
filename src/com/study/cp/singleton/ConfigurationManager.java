package com.study.cp.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置管理器 - 单例模式
 * 使用静态内部类实现，保证线程安全和懒加载
 */
public class ConfigurationManager {

    private final Properties properties;

    // 1. 私有化构造函数，防止外部直接new
    private ConfigurationManager() {
        properties = new Properties();
        // 使用 ClassLoader 从类路径加载资源
        // 路径要从类路径的根（这里是 src）开始写
        String resourcePath = "com/study/cp/singleton/config.properties";

        try (InputStream is = getClass().getClassLoader().getResourceAsStream(resourcePath)){
            // 从项目根目录加载配置文件
            // 对于IDE，通常是项目的根目录；对于命令行，是执行命令的目录
            if (is == null) {
                // 如果资源未找到，is 会是 null，需要处理这种情况
                System.err.println("错误：无法在类路径下找到配置文件: " + resourcePath);
                return;
            }
            properties.load(is);
            System.out.println("--- 配置文件加载成功 ---");
        } catch (IOException e) {
            System.err.println("错误：无法加载配置文件 config.properties");
            e.printStackTrace();
        }
    }

    // 2. 使用静态内部类来持有唯一的实例
    private static class SingletonHolder {
        private static final ConfigurationManager INSTANCE = new ConfigurationManager();
    }

    // 3. 提供全局的公共访问点
    public static ConfigurationManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 根据键获取配置值
     * @param key 配置的键
     * @return 配置的值
     */
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
