package com.study.cp.prototype.exercise;

public class Character2 extends CharacterType{
    public Character2(){
        super.type = "Character2";
        super.setName("Warrior");
        super.getSkills().add("盾击");
        super.getSkills().add("放箭");
    }

    @Override
    public void attack(){
        System.out.println("战士 " + getName() + " 使用了盾击！");
    }
}
