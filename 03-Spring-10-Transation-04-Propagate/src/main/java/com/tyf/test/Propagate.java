package com.tyf.test;

import com.tyf.config.TxConfig;
import com.tyf.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author tyf
 * @create 2022-03-21-14:42
 */
public class Propagate {
    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);

        AccountService accountService = applicationContext.getBean(AccountService.class);

        accountService.addAccount("玛卡巴卡","花园宝宝");
    }
}
