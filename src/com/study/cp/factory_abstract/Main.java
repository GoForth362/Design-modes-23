package com.study.cp.factory_abstract;

import com.study.cp.factory_abstract.factory.GUIFactory;
import com.study.cp.factory_abstract.factory.LinuxFactory;
import com.study.cp.factory_abstract.factory.MacFactory;
import com.study.cp.factory_abstract.factory.WindowsFactory;

// 11. 主程序入口
public class Main {

    // 这是一个配置方法，模拟根据操作系统名称返回相应的工厂
    private static GUIFactory configureFactory() {
        // 在实际应用中，我们会动态检测操作系统
        // String osName = System.getProperty("os.name").toLowerCase();
        // 为了演示，我们手动切换
        String osName = "linux"; // 在这里切换 "windows" 或 "mac" 来查看不同效果

        System.out.println("当前模拟的操作系统是: " + osName);

        if (("windows".equalsIgnoreCase(osName))) {
            return new WindowsFactory();
        } else if (("mac".equalsIgnoreCase(osName))){
            return new MacFactory();
        } else if (("linux".equalsIgnoreCase(osName))) {
            return new LinuxFactory();
        } else {
            throw new IllegalArgumentException("未知的系统");
        }
    }

    public static void main(String[] args) {
        // 1. 根据配置获取具体的工厂
        GUIFactory factory = configureFactory();

        // 2. 将工厂注入到客户端应用中
        Application app = new Application(factory);

        // 3. 运行客户端的业务逻辑
        app.renderUI();
    }
}
