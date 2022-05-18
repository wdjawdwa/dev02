package com.tyf.test;

import com.tyf.entity.ComplexType;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyf
 * @create 2022-03-15-17:08
 */
public class testComplex {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ComplexType complexType = applicationContext.getBean(ComplexType.class);

        System.out.println(complexType);
    }
}
