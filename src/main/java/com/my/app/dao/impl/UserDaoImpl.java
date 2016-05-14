package com.my.app.dao.impl;

import com.my.app.dao.UserDao;
import com.my.app.entity.User;
import org.apache.ibatis.session.SqlSession;

import javax.annotation.Resource;

/**
 * Created by zhangyong on 16/5/13.
 */
public class UserDaoImpl implements UserDao {

    @Resource
    private SqlSession sqlSession;

    public User getUserById(Long id) {
        return sqlSession.selectOne("UserMapper.findUserById",id);
    }
}
