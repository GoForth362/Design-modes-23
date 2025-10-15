package com.study.CP.Prototype.exercise;

import java.util.ArrayList;

public abstract class CharacterType {
    //应该在子类中初始化
    private String name;
    protected String type;
    //模拟真实场景：现实世界中的对象很少只由基本类型构成，通常都包含集合、自定义对象等复杂的引用类型。
    // 这个字段让我们的例子更贴近真实。
    private ArrayList<String> skills;

    public CharacterType(){
        this.skills = new ArrayList<>();
    }

    public void creatCharacter(){
        System.out.println("为角色 '" + this.name + "' 加载昂贵的资源（模型、纹理等）...");
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }

    public abstract void attack();

    @Override
    public Object clone(){
        try {
            CharacterType CloneCharacter = (CharacterType) super.clone();

            //模拟真实场景：现实世界中的对象很少只由基本类型构成，通常都包含集合、自定义对象等复杂的引用类型。
            // 这个字段让我们的例子更贴近真实。
            CloneCharacter.skills = new ArrayList<>(this.skills);
            return CloneCharacter;
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
