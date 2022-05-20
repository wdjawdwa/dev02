package com.tyf.service;

/**
 * @author tyf
 * @create 2022-03-20-17:55
 */
public interface AccountService {
    //转账
    void transfer(Integer from , Integer to , Long money);
}
