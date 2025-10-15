package com.study.CP.Prototype;

import java.util.ArrayList;
import java.util.List;

// 1. 实现 Cloneable 接口
public abstract class GameCharacter implements Cloneable {
    //应该在子类中初始化
    private String name;
    protected String type;
    // 引用类型，用于演示深拷贝和浅拷贝的区别
    private List<String> skills;

    public GameCharacter() {
        this.skills = new ArrayList<>();
    }

    // 模拟昂贵的创建过程
    public void loadExpensiveData() {
        System.out.println("为角色 '" + this.name + "' 加载昂贵的资源（模型、纹理等）...");
        try {
            // 模拟耗时操作
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public abstract void attack();

    // 2. 重写 clone() 方法
    @Override
    public Object clone() {
        Object clone = null;
        try {
            // 默认的 clone() 是浅拷贝
            clone = super.clone();

            // --- 深拷贝的关键步骤 ---
            // 为克隆对象创建一个全新的 List
            GameCharacter clonedChar = (GameCharacter) clone;
            clonedChar.skills = new ArrayList<>(this.skills);
            // ---------------------

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<String> getSkills() { return skills; }
}
