package com.study.CP.Prototype.New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        2. 创建并注册原型对象
//        User user = new User("user", Arrays.asList("view"));
        List<String> userPermission = new ArrayList<>(Arrays.asList("view"));
        User user = new User("user", userPermission);
        List<String> adminAPermission = new ArrayList<>(Arrays.asList("view", "edit", "publish"));
        Admin adminA = new Admin("adminA", adminAPermission);
        Admin adminS = adminA.clone();
//        user.getPermissions().add("delete");
        adminA.getPermissions().add("delete");
        adminS.setPermissions("delete");
        adminS.setPermissions("eat");

        System.out.println(user);
        System.out.println(adminA);
        System.out.println(adminS);

//        1. 创建原型管理器
        PrototypeManager manager = new PrototypeManager();

        manager.registerPrototype("user", user);
        manager.registerPrototype("adminA", adminA);
        manager.registerPrototype("adminS", adminS);

        User user1 = (User) manager.getPrototype("user");
        user1.setName("user1");
        System.out.println(user1);
        user1.setPermissions("delete");
        System.out.println(user1);
        Admin adminA1 = (Admin) manager.getPrototype("adminA");
        adminA1.setName("adminA1");
        System.out.println(adminA1);
        Admin adminS1 = (Admin) manager.getPrototype("adminS");
        adminS1.setName("adminS1");
        System.out.println(adminS1);


    }
}
