package com.tyf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tyf
 * @create 2022-03-25-18:18
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("index")
    public String index(){
        System.out.println("index");
        return "/index.jsp";
    }
    @RequestMapping("toIndex")
    public String toIndex() {
        System.out.println("toIndex");
        return "index";
    }

    @RequestMapping("add")
    public String add() {
        System.out.println("add");
        return "add";
    }

    @RequestMapping("update")
    public String update() {
        System.out.println("update");
        return "update";
    }
}
