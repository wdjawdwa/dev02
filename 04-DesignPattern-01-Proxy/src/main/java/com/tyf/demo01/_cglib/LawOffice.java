package com.tyf.demo01._cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author tyf
 * @create 2022-03-18-18:56
 */
public class LawOffice implements MethodInterceptor {
    @Override
    //target:真实对象，method:真实对象中的方法
    //proxy:代理对象
    public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        if (method.getName().equals("submit")){
            System.out.println("收集证据");
        }

        //使用代理执行真实对象中的方法
        Object o = proxy.invokeSuper(target, args);

        if (method.getName().equals("defend")){
            System.out.println("交换意见");
        }
        return o;
    }
}
