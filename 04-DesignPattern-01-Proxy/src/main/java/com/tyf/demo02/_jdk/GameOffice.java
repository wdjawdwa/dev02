package com.tyf.demo02._jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author tyf
 * @create 2022-03-18-11:07
 */
public class GameOffice implements InvocationHandler {
    private final Object target;

    public GameOffice(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("login")){
            System.out.println("请扫码登录");
        }

        Object invoke = method.invoke(target, args);

        if (method.getName().equals("killBoss")){
            System.out.println("爆装备，爆金币");
        }


        return invoke;
    }
}
