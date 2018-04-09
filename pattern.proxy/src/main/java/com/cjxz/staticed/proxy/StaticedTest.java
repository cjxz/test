package com.cjxz.staticed.proxy;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/8
 * @Version: 1.0
 */
public class StaticedTest {
    public static void main(String[] args) {
        //这里的并没有执行子类的任何方法，而是通过代理类Mather来执行Son类的findLove方法这就是动态代理
        Mather mather = new Mather(new Son());
        mather.findLove();
    }
}
