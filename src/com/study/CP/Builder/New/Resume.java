package com.study.CP.Builder.New;

public class Resume {
    private String name;
    private int age;
    private String education;
    private String awards;
    private String workExperience;
    private String companyName;

    public Resume(int age, String awards, String companyName, String education, String name, String workExperience) {
        this.age = age;
        this.awards = awards;
        this.companyName = companyName;
        this.education = education;
        this.name = name;
        this.workExperience = workExperience;
    }
}
