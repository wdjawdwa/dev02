package com.tyf.demo02._cglib;

import com.tyf.demo02._jdk.GamePlay;

/**
 * @author tyf
 * @create 2022-03-18-10:34
 */
public class GamePlayer implements GamePlay {


    @Override
    public void login() {
        System.out.println("使用 账号 登录游戏");
    }

    @Override
    public void killBoss() {
        System.out.println("暴击 一刀999");
    }

    @Override
    public void upgrade() {
        System.out.println("恭喜玩家，升了一级");
    }
}
