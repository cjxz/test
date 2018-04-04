package com.factory.base.simple;

import com.factory.base.Car;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public class BiekeCar implements Car {
    @Override
    public void myName() {
        System.out.println("别克汽车"+this.toString());
    }
}
