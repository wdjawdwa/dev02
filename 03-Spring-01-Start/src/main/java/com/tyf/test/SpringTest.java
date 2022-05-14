package com.tyf.test;

import com.tyf.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyf
 * @create 2022-03-14-17:52
 */
public class SpringTest {
    @Test
    public void test(){
        //获取容器
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取对象
        UserDao userDao = context.getBean("userDao", UserDao.class);

        userDao.findAll();
    }
}
