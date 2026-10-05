package com.study.SP.Decorator.New.Cache;

import java.util.HashMap;
import java.util.Map;

public class UserDaoCacheDecorator implements UserDao{
    private final UserDao decoratedDao;
    // 用哈希表来模拟缓存，key 是用户 ID，value 是用户名
    private final Map<Integer, String> cache = new HashMap<>();

    public UserDaoCacheDecorator(UserDao decoratedDao) {
        this.decoratedDao = decoratedDao;
    }

    @Override
    public String getUserNameBy(int id) {
        // 先从缓存中查询，如果缓存中没有则查询数据库
        if (cache.containsKey(id)) {
            String userName = cache.get(id);
            System.out.println("Cache hit, username: " + userName);
            return cache.get(id);
        }
        String userName = decoratedDao.getUserNameBy(id);
        cache.put(id, userName);
        return userName;
    }
}
