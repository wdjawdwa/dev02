package com.tyf.demo01._jdk;

/**
 * @author tyf
 * @create 2022-03-18-10:20
 */
//原告，被代理对象,真实对象
public class Parties implements Lawsuit {

    @Override
    public void submit() {
        System.out.println("江南皮革厂倒闭了，老板跑路了");
    }

    @Override
    public void defend() {
        System.out.println("还我血汗钱");
    }
}
