package com.study.CP.Singleton;

import java.util.HashMap;
import java.util.Map;

//单例模式：全局唯一，全局访问，避免重复连接浪费资源
public class Main {
    public static void main(String[] args) {
        //eh式
        DatabaseManagerL db1 = DatabaseManagerL.getInstance();
        DatabaseManagerL db2 = DatabaseManagerL.getInstance();

        db1.execute("SELECT * FROM users");
        db2.execute("SELECT * FROM customers");

        System.out.println("Same Instance: " + (db1 == db2));
    }
}

/**
 * 饿汉式，用static final创建全局唯一实例
 */
class DatabaseManagerE {
    private static final DatabaseManagerE INSTANCE = new DatabaseManagerE();
    private String connectionInfo;

    //私有构造，外部代码无法创建实例
    private DatabaseManagerE() {
        this.connectionInfo = "mysql://localhost:3306/myDataBaseE";
        System.out.println("Connection established: " + connectionInfo);
    }

    //提供全局访问点，static避免要先创建类，这违反了单例模式
    public static DatabaseManagerE getInstance() {
        return INSTANCE;
    }

    //业务代码
    public void execute(String sql) {
        System.out.println("Executing " + sql);
    }
}

/**
 * 懒汉式，懒启动，第一次用时才创建实例，但是要加锁避免同时创建两个
 */
class DatabaseManagerL {
    private static volatile DatabaseManagerL instance;
    private String connectionInfo;

    private DatabaseManagerL() {
        this.connectionInfo = "mysql://localhost:3306/myDataBaseL";
        System.out.println("Connection established: " + connectionInfo);
    }

    public static DatabaseManagerL getInstance() {
        //双重检查
        /*
线程 A 进入同步代码块，锁住 Database.class。
线程 B 也运行到这里，但发现锁被占用，只能等待。
线程 A 创建对象并退出代码块，同时释放锁。
线程 B 获得锁并进入。
线程 B 再次检查 instance == null，发现对象已经创建，因此不会重复创建。
         */
        if (instance == null) {
            synchronized (DatabaseManagerL.class) {
                if (instance == null) {
                    instance = new DatabaseManagerL();
                }
            }
        }
        return instance;
    }

    //业务代码
    public void execute(String sql) {
        System.out.println("Executing " + sql);
    }
}

/**
 * 练习
 */
class ConfigManagerE {
    private static final ConfigManagerE INSTANCE = new ConfigManagerE();
    private Map<String, String> configInfo;

    private ConfigManagerE() {
        configInfo = new HashMap<>();
        System.out.println("ConfigManager");
    }

    public static ConfigManagerE getInstance() {
        return INSTANCE;
    }

    //业务方法
    public void setConfigInfo(String key, String value) {
        configInfo.put(key, value);
    }

    public String getConfig(String key) {
        return configInfo.getOrDefault(key, null);
    }
}

class ConfigManagerL {
    private static ConfigManagerL instance = null;
    private Map<String, String> configInfo;

    private ConfigManagerL() {
        System.out.println("ConfigManager");
        configInfo = new HashMap<>();
    }

    public static ConfigManagerL getInstance() {
        if (instance == null) {
            synchronized (ConfigManagerL.class) {
                if (instance == null) {
                    instance = new ConfigManagerL();
                }
            }
        }
        return instance;
    }

    public void setConfig(String key, String value){
        configInfo.put(key,value);
    }

    public String getConfig(String key){
        return configInfo.getOrDefault(key,null);
    }

    // 重置单例实例（仅用于测试）
    public static void resetInstance() {
        instance = null;
    }
}











