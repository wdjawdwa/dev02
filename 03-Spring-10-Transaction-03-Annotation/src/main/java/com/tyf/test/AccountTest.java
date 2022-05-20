package com.tyf.test;

import com.tyf.config.TxConfig;
import com.tyf.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyf
 * @create 2022-03-20-18:02
 */
public class AccountTest {

    @Test
    public void testAnnotation(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);

        AccountService accountService = applicationContext.getBean(AccountService.class);

        accountService.transfer(1 , 2 , 520L);
    }

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService accountService = applicationContext.getBean("annotationService",AccountService.class);

        accountService.transfer(1,2,100L);
    }
}
