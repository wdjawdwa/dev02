package com.tyf.test;

import com.tyf.dao.impl.UserDaoImpl;
import org.junit.Test;

public class UserTest {
    @Test
    public void test() {
        UserDaoImpl userDao = new UserDaoImpl();

        userDao.findAll();
    }
}
