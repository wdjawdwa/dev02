package com.tyf.dao.impl;

import com.tyf.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author tyf
 * @create 2022-03-20-17:50
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void increaseMoney(Integer id , Long money) {
        getJdbcTemplate().update("update account set money = money + ? where id = ?",money ,id);

        System.out.println("得加钱");
    }

    @Override
    public void decreaseMoney(Integer id , Long money) {
        getJdbcTemplate().update("update account set money = money - ? where id = ?",money ,id);

        System.out.println("掏钱");
    }
}
