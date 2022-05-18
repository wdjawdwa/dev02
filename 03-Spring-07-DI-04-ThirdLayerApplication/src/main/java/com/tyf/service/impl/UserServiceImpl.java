package com.tyf.service.impl;

import com.tyf.dao.UserDao;
import com.tyf.dao.impl.UserDaoImpl;
import com.tyf.entity.User;
import com.tyf.service.UserService;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-15-17:25
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao ;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
