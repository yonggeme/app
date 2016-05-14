package com.my.app.service;

import com.my.app.entity.User;

/**
 * Created by zhangyong on 16/5/14.
 */
public interface UserService {
    public User findUserById(Long id);
}
