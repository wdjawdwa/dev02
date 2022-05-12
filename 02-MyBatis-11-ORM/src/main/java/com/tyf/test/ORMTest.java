package com.tyf.test;


import com.tyf.dao.AccountDao;
import com.tyf.entity.Account;
import com.tyf.entity.TAccount;
import com.tyf.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-06-13:44
 */
public class ORMTest {

    @Test
    public void testCamelCase(){
        AccountDao accountDao = MyBatisUtil.getMapper(AccountDao.class);

        List<TAccount> accounts = accountDao.findAllByCamelCase();

        for (TAccount account : accounts) {
            System.out.println(account);
        }
        MyBatisUtil.commit();
    }

    @Test
    public void testMap(){
        AccountDao accountDao = MyBatisUtil.getMapper(AccountDao.class);

        Account account = accountDao.findById(1);

        System.out.println(account);
        MyBatisUtil.commit();
    }

    @Test
    public void test(){
        AccountDao accountDao = MyBatisUtil.getMapper(AccountDao.class);

        List<Account> accounts = accountDao.findAll();

        for (Account account : accounts) {
            System.out.println(account);
        }

        MyBatisUtil.commit();

    }
}