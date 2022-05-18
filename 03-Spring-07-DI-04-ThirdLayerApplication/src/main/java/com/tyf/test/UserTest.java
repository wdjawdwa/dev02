package com.tyf.test;

import com.tyf.controller.UserController;
import com.tyf.dao.UserDao;
import com.tyf.entity.User;
import com.tyf.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-15-17:31
 */
public class UserTest {
    @Test
    public void test(){
        UserController userController = new UserController();

        List<User> list = userController.findAll();

        System.out.println(list);
    }

    @Test
    public void testContext(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = applicationContext.getBean(User.class);
        UserController userController = applicationContext.getBean(UserController.class);

        System.out.println(user);
        System.out.println(userController);

        List<User> list = userController.findAll();

        System.out.println(list);
    }
}
