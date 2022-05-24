package com.tyf.demo02._static;

import org.junit.Test;

/**
 * @author tyf
 * @create 2022-03-18-10:38
 */
public class Client {
    @Test
    public void test(){
        //真实对象
        GamePlayer gamePlayer = new GamePlayer();

        //代练
        GamePlayProxy gamePlayProxy = new GamePlayProxy(gamePlayer);

        gamePlayProxy.login();
        gamePlayProxy.killBoss();
        gamePlayProxy.upgrade();
    }
}
