package com.tyf.test;

import com.tyf.controller.UserController;
import com.tyf.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-15-17:31
 */
public class UserTest {
    @Test
    public void testIoc(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.tyf");

        UserController userController = applicationContext.getBean(UserController.class);

        System.out.println(userController);
    }

    @Test
    public void testDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = applicationContext.getBean(User.class);
        UserController userController = applicationContext.getBean(UserController.class);


        List<User> list = userController.findAll();

        System.out.println(list);
    }

    @Test
    public void testValue(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = applicationContext.getBean(User.class);

        applicationContext.close();
    }
}
