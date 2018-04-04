package com.factory.base.abstarct;

import com.factory.base.Car;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public class TestAbstarctFactory {
    public static void main(String[] args) {
        DefaultCarFactory defaultCarFactory = new DefaultCarFactory();
        Car car = defaultCarFactory.getBiaozhiCar();
        car.myName();
    }
}
