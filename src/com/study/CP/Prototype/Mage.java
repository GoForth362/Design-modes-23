package com.study.CP.Prototype;

public class Mage extends GameCharacter {
    public Mage(String name) {
        this.type = "Mage";
        setName(name);
        getSkills().add("火球术");
        getSkills().add("寒冰箭");
    }

    @Override
    public void attack() {
        System.out.println("法师 " + getName() + " 释放了火球术！");
    }
}
