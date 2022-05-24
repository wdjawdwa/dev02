package com.tyf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tyf
 * @create 2022-03-22-17:05
 */

//将当前类注入到容器中
@Controller
//用于声明请求的url路径，和@WebServlet注解相同
@RequestMapping("user")
public class UserController {

    //方法上也能加RequestMapping注解，相当于二级路径
    @RequestMapping("login")
    public String login(){
        System.out.println("login");

        //指定页面跳转的路径，注意加/代表从根路径开始
        //如果使用void会404
        //如果需要页面跳转，必须通过根路径的方式，必须加 /
        return "/login.jsp";
    }

}
