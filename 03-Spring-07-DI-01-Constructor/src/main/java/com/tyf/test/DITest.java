package com.tyf.test;

import com.tyf.entity.Car;
import com.tyf.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyf
 * @create 2022-03-14-22:20
 */
public class DITest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = applicationContext.getBean(Car.class);

        System.out.println(car.hashCode());

        Person person = applicationContext.getBean(Person.class);

        System.out.println(person.getCar().hashCode());
    }
}
