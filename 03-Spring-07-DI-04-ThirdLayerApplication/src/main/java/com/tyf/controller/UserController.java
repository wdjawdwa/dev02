package com.tyf.controller;

import com.tyf.entity.User;
import com.tyf.service.UserService;
import com.tyf.service.impl.UserServiceImpl;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-15-17:28
 */
public class UserController {
    private UserService userService;

    public List<User> findAll(){
        return userService.findAll();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
