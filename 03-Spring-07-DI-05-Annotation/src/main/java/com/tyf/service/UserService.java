package com.tyf.service;

import com.tyf.entity.User;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-15-17:24
 */
public interface UserService {
    List<User> findAll();
}
