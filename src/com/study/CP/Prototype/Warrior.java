package com.study.CP.Prototype;

public class Warrior extends GameCharacter {
    public Warrior(String name) {
        this.type = "Warrior";
        setName(name);
        getSkills().add("猛击");
        getSkills().add("盾牌格挡");
    }

    @Override
    public void attack() {
        System.out.println("战士 " + getName() + " 使用了猛击！");
    }
}
