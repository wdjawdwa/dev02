package com.tyf.test;

import com.tyf.config.AopConfig;
import com.tyf.service.UserService;
import com.tyf.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyf
 * @create 2022-03-19-18:15
 */
public class XMLTest {
    @Test
    public void testAnnotation(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);

        userService.add();
    }

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = applicationContext.getBean(UserService.class);

        userService.add();

        System.out.println("----------------分割----------------");

        userService.update();
    }
}
