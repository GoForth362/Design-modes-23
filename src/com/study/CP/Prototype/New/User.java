package com.study.CP.Prototype.New;

import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable<User>{
    private String name;
    private List<String> permissions;

    public User(String name, List<String> permissions) {
        this.name = name;
        this.permissions = new ArrayList<>(permissions);
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

    @Override
    public User clone() {
        List<String> clonedPermissions = new ArrayList<>(this.permissions);
        return new User(this.name, clonedPermissions);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
