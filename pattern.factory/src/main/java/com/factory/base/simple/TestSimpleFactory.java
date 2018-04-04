package com.factory.base.simple;

import com.factory.base.Car;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        //要从工厂里面的到对象
        SimpleFactory simpleFactory = new SimpleFactory();
        Car car = simpleFactory.getCar("kaluola");
        car.myName();
    }
}
