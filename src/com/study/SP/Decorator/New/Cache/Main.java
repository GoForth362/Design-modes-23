package com.study.SP.Decorator.New.Cache;

public class Main {
    public static void main(String[] args) {
        // 每次调用都会查询数据库
        UserDao dao = new UserDaoImpl();
        dao.getUserNameBy(1);
        dao.getUserNameBy(1);

        UserDao userDao = new UserDaoCacheDecorator(dao);
        userDao.getUserNameBy(1);
        userDao.getUserNameBy(1);

    }
}