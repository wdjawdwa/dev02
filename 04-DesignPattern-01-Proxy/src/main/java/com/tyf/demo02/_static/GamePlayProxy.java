package com.tyf.demo02._static;

/**
 * @author tyf
 * @create 2022-03-18-10:36
 */
//代练 ， 代理
public class GamePlayProxy implements GamePlay{
    //代理中包含了一个真实对象
    private final GamePlay player;

    public GamePlayProxy(GamePlay player) {
        this.player = player;
    }

    @Override
    public void login() {
        this.verify();
        player.login();
    }

    @Override
    public void killBoss() {
        player.killBoss();
        this.addMoney();
    }

    @Override
    public void upgrade() {
        player.upgrade();
    }

    public void verify(){
        System.out.println("请输入您的手机的验证码~~~");
    }

    private void addMoney() {
        System.out.println("掉了一堆金币，和一把屠龙刀");
    }
}
