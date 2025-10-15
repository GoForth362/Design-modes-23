package com.study.CP.Prototype.exercise;

public class Character1 extends CharacterType {
    public Character1(String name){
        super.type = "Character1";
        super.setName(name);
        super.getSkills().add("火球术");
        super.getSkills().add("水龙术");
    }

    @Override
    public void attack(){
        System.out.println("法师 " + getName() + " 释放了火球术！");
    }
}
