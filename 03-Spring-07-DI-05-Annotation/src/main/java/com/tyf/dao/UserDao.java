package com.tyf.dao;

import com.tyf.entity.User;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-15-17:18
 */
public interface UserDao {
    List<User> findAll();
}
