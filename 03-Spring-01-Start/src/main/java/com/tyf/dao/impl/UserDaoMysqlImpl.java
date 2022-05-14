package com.tyf.dao.impl;

import com.tyf.dao.UserDao;

/**
 * @author tyf
 * @create 2022-03-14-18:03
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("使用MySQL");
    }
}
