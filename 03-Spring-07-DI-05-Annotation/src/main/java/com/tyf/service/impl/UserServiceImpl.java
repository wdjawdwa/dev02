package com.tyf.service.impl;

import com.tyf.dao.UserDao;
import com.tyf.entity.User;
import com.tyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * @author tyf
 * @create 2022-03-15-17:25
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    //在数据类型相同的情况下，再根据id进行注入
    @Qualifier("userDaoImpl")
    //既根据类型又会匹配id
    @Resource(name="userDaoImpl")
    private UserDao userDao ;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

}
