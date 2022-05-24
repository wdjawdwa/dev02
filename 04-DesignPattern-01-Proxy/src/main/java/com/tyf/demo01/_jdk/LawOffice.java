package com.tyf.demo01._jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author tyf
 * @create 2022-03-18-10:45
 */
public class LawOffice implements InvocationHandler {
    //真实对象
    private final Object target;

    public LawOffice(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("submit")){
            System.out.println("收集证据");
        }

        Object invoke = method.invoke(target, args);

        if (method.getName().equals("defend")){
            System.out.println("交换意见");
        }
        return invoke;
    }
}
