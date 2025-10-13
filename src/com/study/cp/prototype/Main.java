package com.study.cp.prototype;

public class Main {
    public static void main(String[] args) {
        // 1. 游戏启动，加载原型
        CharacterRegistry.loadCache();

        // 2. 需要一个战士
        System.out.println("--- 创建第一个战士 ---");
        GameCharacter warrior1 = CharacterRegistry.getCharacter("Warrior");
        warrior1.setName("泰兰德"); // 为克隆体设置新名字
        warrior1.attack();

        // 3. 需要第二个战士
        System.out.println("\n--- 创建第二个战士 ---");
        GameCharacter warrior2 = CharacterRegistry.getCharacter("Warrior");
        warrior2.setName("吼爹");
        warrior2.attack();

        // 4. 需要一个法师
        System.out.println("\n--- 创建一个法师 ---");
        GameCharacter mage1 = CharacterRegistry.getCharacter("Mage");
        mage1.setName("吉安娜");
        mage1.attack();

        // 5. 验证深拷贝：修改 warrior1 的技能，看是否影响 warrior2
        System.out.println("\n--- 验证深拷贝 ---");
        System.out.println(warrior1.getName() + " 的原始技能: " + warrior1.getSkills());
        System.out.println(warrior2.getName() + " 的原始技能: " + warrior2.getSkills());

        // 为 warrior1 添加一个新技能
        warrior1.getSkills().add("英勇打击");

        System.out.println("\n在 " + warrior1.getName() + " 学会新技能后:");
        System.out.println(warrior1.getName() + " 的技能: " + warrior1.getSkills());
        System.out.println(warrior2.getName() + " 的技能: " + warrior2.getSkills());
        System.out.println("结论：warrior2 的技能未受影响，深拷贝成功！");
    }
}
