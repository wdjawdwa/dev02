package com.tyf.demo01._cglib;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @author tyf
 * @create 2022-03-18-19:00
 */
public class Court {
    @Test
    public void test(){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(Parties.class);
        enhancer.setCallback(new LawOffice());
        Parties proxy = (Parties) enhancer.create();

        proxy.submit();
        proxy.defend();
    }
}
