package com.tyf.dao.impl;

import com.tyf.dao.UserDao;
import com.tyf.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tyf
 * @create 2022-03-15-17:35
 */
@Repository("userDaoMysqlImpl")
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public List<User> findAll() {
        //连接数据库...

        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1,"海绵宝宝","123456"));
        users.add(new User(2,"派大星","666666"));
        users.add(new User(3,"章鱼哥","888888"));

        return users;
    }
}
