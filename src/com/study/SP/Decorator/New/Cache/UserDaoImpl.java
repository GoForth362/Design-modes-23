package com.study.SP.Decorator.New.Cache;

public class UserDaoImpl implements UserDao {
    @Override
    public String getUserNameBy(int id) {
        String userName = "User" + id;
        System.out.println("Query DB: id = " + id + ", username: " + userName);
        return userName;
    }
}
