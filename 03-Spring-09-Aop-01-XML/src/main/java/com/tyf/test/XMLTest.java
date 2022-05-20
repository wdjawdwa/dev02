package com.tyf.test;

import com.tyf.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyf
 * @create 2022-03-19-18:15
 */
public class XMLTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = applicationContext.getBean(UserService.class);

        userService.add();

        System.out.println("----------------分割----------------");

        userService.update();
    }
}
