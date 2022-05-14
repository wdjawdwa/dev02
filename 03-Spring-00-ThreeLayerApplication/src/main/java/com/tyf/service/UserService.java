package com.tyf.service;

import com.tyf.dao.UserDao;

/**
 * @author tyf
 * @create 2022-03-13-17:49
 */
public interface UserService {
    void useDateBase();

    void setUserDao(UserDao userDao);
}
