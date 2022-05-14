package com.tyf.test;

import com.tyf.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyf
 * @create 2022-03-14-18:23
 */
public class BeanNameTest {
    @Test
    public void test(){
        //获取容器
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student student = context.getBean("student", Student.class);

        System.out.println(student);
    }
}
