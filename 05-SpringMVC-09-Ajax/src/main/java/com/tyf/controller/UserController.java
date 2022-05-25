package com.tyf.controller;

import com.tyf.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tyf
 * @create 2022-03-27-11:01
 */
@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("register")
    public Map<String ,Object> register(String  user){
        System.out.println(user);

        HashMap<String , Object> map = new HashMap<>();

        map.put("code",200);
        map.put("message","注册成功");
        map.put("success",true);
        map.put("data","狂拽酷炫霸");


        //        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return map;
    }

    @RequestMapping("getJson")
    public Map<String ,Object> getJson(@RequestBody User user){
        System.out.println(user);

        HashMap<String , Object> map = new HashMap<>();

        map.put("code",200);
        map.put("message","注册成功");
        map.put("success",true);
        map.put("data","狂拽酷炫霸");

        return map;
    }
}
