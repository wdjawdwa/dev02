package com.tyf.service.impl;

import com.tyf.dao.AccountDao;
import com.tyf.service.AccountService;

/**
 * @author tyf
 * @create 2022-03-20-17:57
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    @Override
    public void transfer(Integer from, Integer to, Long money) {
        accountDao.decreaseMoney(from , money);

        int num = 1 / 0;

        accountDao.increaseMoney(to , money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
