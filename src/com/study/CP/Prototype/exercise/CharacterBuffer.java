package com.study.CP.Prototype.exercise;

import java.util.Hashtable;

public class CharacterBuffer {
    private static Hashtable<String,CharacterType> characterCache= new Hashtable<>();

    public static void loadCache(){
        System.out.println("=== 开始加载角色原型到缓存... ===");
        Character1 character1 = new Character1("原型法师");
        character1.creatCharacter();
        characterCache.put("Mage",character1);

        System.out.println("=== 开始加载角色原型到缓存... ===");
        Character1 character2 = new Character1("原型战士");
        character1.creatCharacter();
        characterCache.put("Warrior",character1);
        System.out.println("=== 角色原型加载完毕！ ===\n");
    }

    public static CharacterType getCharacter(String type){
        CharacterType cachedCharacter = characterCache.get(type);
        return (CharacterType) cachedCharacter.clone();
    }
}
