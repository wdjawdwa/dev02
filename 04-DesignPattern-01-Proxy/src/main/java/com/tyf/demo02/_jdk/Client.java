package com.tyf.demo02._jdk;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author tyf
 * @create 2022-03-18-11:08
 */
public class Client {
    @Test
    public void test(){
        //真实对象
        GamePlayer player = new GamePlayer();

        InvocationHandler gameOffice = new GameOffice(player);

        GamePlay proxy = (GamePlay) Proxy.newProxyInstance(player.getClass().getClassLoader(),
                player.getClass().getInterfaces(), gameOffice);

        proxy.login();
        proxy.killBoss();
        proxy.upgrade();
    }
}
