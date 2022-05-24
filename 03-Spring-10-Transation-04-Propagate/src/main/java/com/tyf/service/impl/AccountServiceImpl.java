package com.tyf.service.impl;

import com.tyf.dao.AccountDao;
import com.tyf.service.AccountService;
import com.tyf.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tyf
 * @create 2022-03-21-14:36
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LocationService locationService;

    @Override
    public void addAccount(String name , String location) {
        accountDao.addAccount(name);

        int num = 1/0;

        locationService.addLocation(location);
    }
}
