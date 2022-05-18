package com.tyf.test;

import com.tyf.entity.Student;
import com.tyf.entity.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyf
 * @create 2022-03-15-16:46
 */
public class SetTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = applicationContext.getBean(Student.class);

        System.out.println(student);

        Teacher teacher = applicationContext.getBean(Teacher.class);

        System.out.println(teacher);
    }
}
