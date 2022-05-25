package com.tyf.controller;

import com.tyf.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author tyf
 * @create 2022-03-27-10:14
 */
@RestController
@RequestMapping("controller")
public class TestRestControllerAnnotationController {
    @RequestMapping("getUser")
    public User testUser(){
        return new User("易烊千玺",22,"男",new Date(),"四个字");
    }
}
