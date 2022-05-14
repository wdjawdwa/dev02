package com.tyf.dao.impl;

import com.tyf.dao.UserDao;

/**
 * @author tyf
 * @create 2022-03-13-17:44
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void useDateBase() {
        System.out.println("连接数据库");
    }
}
