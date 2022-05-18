package com.tyf.controller;

import com.tyf.entity.User;
import com.tyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-15-17:28
 */
@Controller
public class UserController {
    //自动装配，会从容器中找到对应的数据类型进行注入
    @Autowired
    private UserService userService;

    public List<User> findAll(){
        return userService.findAll();
    }

}
