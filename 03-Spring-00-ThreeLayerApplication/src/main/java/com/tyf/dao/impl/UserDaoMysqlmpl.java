package com.tyf.dao.impl;

import com.tyf.dao.UserDao;

/**
 * @author tyf
 * @create 2022-03-13-18:12
 */
public class UserDaoMysqlmpl implements UserDao {
    @Override
    public void useDateBase() {
        System.out.println("使用Mysql连接数据库");
    }
}
