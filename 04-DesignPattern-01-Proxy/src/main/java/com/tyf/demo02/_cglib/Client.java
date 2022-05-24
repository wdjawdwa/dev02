package com.tyf.demo02._cglib;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @author tyf
 * @create 2022-03-18-19:11
 */
public class Client {
    @Test
    public void test(){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(GamePlayer.class);
        enhancer.setCallback(new GameOffice());
        GamePlayer proxy = (GamePlayer) enhancer.create();

        proxy.login();
        proxy.killBoss();
        proxy.upgrade();
    }
}
