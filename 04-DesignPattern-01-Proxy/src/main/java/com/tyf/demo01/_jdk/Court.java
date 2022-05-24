package com.tyf.demo01._jdk;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author tyf
 * @create 2022-03-18-10:48
 */
public class Court {
    @Test
    public void test(){
        //原告
        Lawsuit parties = new Parties();

        //获取律师事务所
        InvocationHandler lawOffice = new LawOffice(parties);

        Lawsuit proxy = (Lawsuit) Proxy.newProxyInstance(parties.getClass().getClassLoader(),
                parties.getClass().getInterfaces(), lawOffice);

        proxy.submit();
        proxy.defend();
    }
}
