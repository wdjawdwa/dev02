package com.tyf.service.impl;

import com.tyf.dao.UserDao;
import com.tyf.dao.impl.UserDaoImpl;
import com.tyf.dao.impl.UserDaoMysqlmpl;
import com.tyf.dao.impl.UserDaoOracleImpl;
import com.tyf.service.UserService;

/**
 * @author tyf
 * @create 2022-03-13-17:50
 * 业务层
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void useDateBase() {
        userDao.useDateBase();
    }

    @Override
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
