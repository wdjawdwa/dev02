package com.tyf.test;

import com.tyf.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyf
 * @create 2022-03-20-18:02
 */
public class AccountTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService accountService = applicationContext.getBean("programmingService",AccountService.class);

        accountService.transfer(1,2,100L);
    }
}
