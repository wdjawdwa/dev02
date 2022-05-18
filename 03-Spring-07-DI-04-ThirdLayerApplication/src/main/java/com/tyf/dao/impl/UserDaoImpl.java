package com.tyf.dao.impl;

import com.tyf.dao.UserDao;
import com.tyf.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tyf
 * @create 2022-03-15-17:19
 */
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findAll() {
        //连接数据库...

        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1,"玛卡巴卡","123456"));
        users.add(new User(2,"依古比古","666666"));
        users.add(new User(3,"依古比古","888888"));

        return users;
    }
}
