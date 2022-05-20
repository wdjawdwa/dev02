package com.tyf.service.impl;

import com.tyf.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author tyf
 * @create 2022-03-19-18:02
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加一个学生");
    }

    @Override
    public void update() {
        //异常
        int num =1 / 0;
        System.out.println("修改了学生的信息");
    }
}
