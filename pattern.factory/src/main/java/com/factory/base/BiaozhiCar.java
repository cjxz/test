package com.factory.base;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public class BiaozhiCar implements Car {
    @Override
    public void myName() {
        System.out.println("标致汽车:"+this.toString());
    }
}
