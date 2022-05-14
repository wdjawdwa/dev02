package com.tyf.test;

import com.tyf.dao.impl.UserDaoImpl;
import com.tyf.dao.impl.UserDaoMysqlmpl;
import com.tyf.dao.impl.UserDaoOracleImpl;
import com.tyf.service.UserService;
import com.tyf.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * @author tyf
 * @create 2022-03-13-17:56
 */
public class UserTest {
    @Test
    public void test(){
        UserService userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoOracleImpl());

        userService.useDateBase();
    }
}
