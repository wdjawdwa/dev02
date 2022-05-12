package com.tyf.dao;

import com.tyf.entity.Account;
import com.tyf.entity.TAccount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-09-18:53
 */
public interface AccountDao {
    List<Account> findAll();

    Account findById(@Param("id") Integer id);

    List<TAccount> findAllByCamelCase();
}
