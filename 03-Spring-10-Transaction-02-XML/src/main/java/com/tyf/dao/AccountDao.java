package com.tyf.dao;

/**
 * @author tyf
 * @create 2022-03-20-17:49
 */
public interface AccountDao {
    //加钱
    void increaseMoney(Integer id , Long money);

    //扣钱
    void decreaseMoney(Integer id , Long money);
}
