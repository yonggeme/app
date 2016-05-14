package com.my.app.service.impl;

import com.my.app.dao.UserDao;
import com.my.app.entity.User;
import com.my.app.service.UserService;

import javax.annotation.Resource;

/**
 * Created by zhangyong on 16/5/14.
 */
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    public User findUserById(Long id) {
        return userDao.getUserById(id);
    }
}
