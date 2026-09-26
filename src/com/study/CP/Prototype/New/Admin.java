package com.study.CP.Prototype.New;

import java.util.ArrayList;
import java.util.List;

public class Admin implements Cloneable<Admin> {
    private String name;
    private List<String> permissions;

    public Admin(String name, List<String> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    //深拷贝
    @Override
    public Admin clone() {
        List<String> clonedPermissions = new ArrayList<>(this.permissions);
        return new Admin(this.name, clonedPermissions);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
