package com.tyf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tyf
 * @create 2022-03-23-19:12
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping(path = "register1")
    public void getParam(String name , Integer age){
        System.out.println(name +":" +age);
    }
}
