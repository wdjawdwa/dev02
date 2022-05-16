package com.tyf.test;

import com.tyf.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyf
 * @create 2022-03-14-21:20
 */
public class LifecycleTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = applicationContext.getBean("student", Student.class);

        System.out.println(student);

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
