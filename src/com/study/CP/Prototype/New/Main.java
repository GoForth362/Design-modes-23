package com.study.CP.Prototype.New;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. 创建原型管理器
        PrototypeManager manager = new PrototypeManager();

// 2. 创建并注册原型对象
        User readonly = new User("readonly", Arrays.asList("view"));
        Admin admin = new Admin("admin", Arrays.asList("view", "edit", "delete"));
        Admin superAdmin = new Admin("superAdmin", Arrays.asList("view", "edit", "delete", "publish"));
        manager.registerPrototype("readonly", readonly);
        manager.registerPrototype("admin", admin);
        manager.registerPrototype("superAdmin", superAdmin);

        Cloneable<?> prototype = manager.getPrototype("readonly");
        System.out.println(prototype);
    }
}
