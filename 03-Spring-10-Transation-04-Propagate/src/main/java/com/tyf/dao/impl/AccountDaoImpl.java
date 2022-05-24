package com.tyf.dao.impl;

import com.tyf.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author tyf
 * @create 2022-03-21-14:17
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void addAccount(String name) {
        getJdbcTemplate().update("insert into account(name) values (?)",name);

    }
}
