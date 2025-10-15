package com.study.CP.Prototype.exercise;

public class Main {
    public static void main(String[] args) {
        CharacterBuffer.loadCache();

        System.out.println("--- 创建第一个法师 ---");
        CharacterType character1 = CharacterBuffer.getCharacter("Mage");
        System.out.println("--- 创建第一个战士 ---");
        CharacterType character2 = CharacterBuffer.getCharacter("Warrior");

        System.out.println("--- 创建第二个法师 ---");
        CharacterType character3 = CharacterBuffer.getCharacter("Mage");
        System.out.println("--- 创建第二个战士 ---");
        CharacterType character4 = CharacterBuffer.getCharacter("Warrior");

    }
}
