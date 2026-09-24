package com.study.CP.Builder.New;

public class ResumeBuilder {
    private String name;
    private int age;
    private String education;
    private String awards;
    private String workExperience;
    private String companyName;

    //写成构造函数技术上当然可以，但这就违背了生成器模式“避免构造函数参数过多”的初衷。
//你注意看这个方法最后有一行 return this;，这是生成器模式的灵魂。它的作用是支持链式调用。就像文章里展示的：
    public ResumeBuilder setBasicInfo(String name, int age, String education) {
        this.name = name;
        this.age = age;
        this.education = education;
        return this;
    }

    public ResumeBuilder setAwards(String awards) {
        this.awards = awards;
        return this;
    }

    public ResumeBuilder setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
        return this;
    }

    public ResumeBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    //如果没有给 awards 赋值（也就是没有调用 setAwards() 方法），
//那么 ResumeBuilder 里的 awards 字段就会保持 Java 中引用类型的默认值，也就是 null。
    public Resume builder() {
        if (name == null || age == 0 || education == null) {
            throw new IllegalArgumentException("Name, age and education are required");
        }
        return new Resume(age, awards, companyName, education, name, workExperience);
    }

}
