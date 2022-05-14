package com.tyf.dao.impl;

import com.tyf.dao.UserDao;

/**
 * @author tyf
 * @create 2022-03-14-18:01
 */
public class UserDaoOracleImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("使用Oracle数据库");
    }
}
