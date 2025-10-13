package com.study.cp.prototype;

import java.util.Hashtable;

public class CharacterRegistry {
    private static Hashtable<String, GameCharacter> characterCache = new Hashtable<>();

    // 在游戏启动时加载所有原型
    public static void loadCache() {
        System.out.println("=== 开始加载角色原型到缓存... ===");
        Warrior warriorPrototype = new Warrior("原型战士");
        warriorPrototype.loadExpensiveData(); // 昂贵的创建过程只在此时执行一次
        characterCache.put("Warrior", warriorPrototype);

        Mage magePrototype = new Mage("原型法师");
        magePrototype.loadExpensiveData(); // 昂贵的创建过程只在此时执行一次
        characterCache.put("Mage", magePrototype);
        System.out.println("=== 角色原型加载完毕！ ===\n");
    }

    // 从缓存获取角色的克隆体
    public static GameCharacter getCharacter(String type) {
        GameCharacter cachedCharacter = characterCache.get(type);
        // 返回的是原型的克隆，而不是原型本身
        return (GameCharacter) cachedCharacter.clone();
    }
}
