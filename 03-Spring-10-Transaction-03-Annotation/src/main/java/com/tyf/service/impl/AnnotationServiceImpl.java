package com.tyf.service.impl;

import com.tyf.dao.AccountDao;
import com.tyf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tyf
 * @create 2022-03-20-21:48
 */
@Transactional
@Service
public class AnnotationServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;


    @Override
    public void transfer(Integer from, Integer to, Long money) {
                accountDao.decreaseMoney(from , money);

                int num = 1 / 0;

                accountDao.increaseMoney(to , money);

    }


}
