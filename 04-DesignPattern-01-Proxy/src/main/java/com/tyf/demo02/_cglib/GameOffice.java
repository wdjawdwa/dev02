package com.tyf.demo02._cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author tyf
 * @create 2022-03-18-19:10
 */
public class GameOffice implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        if (method.getName().equals("login")){
            System.out.println("请扫码登录");
        }

        //执行方法
        Object o = proxy.invokeSuper(obj, args);

        if (method.getName().equals("killBoss")){
            System.out.println("爆装备，爆金币");
        }

        return o;
    }
}
