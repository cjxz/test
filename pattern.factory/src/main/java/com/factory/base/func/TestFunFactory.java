package com.factory.base.func;

import com.factory.base.Car;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public class TestFunFactory {
    public static void main(String[] args) {
        //用户需要知道创建什么工厂来生成对应的汽车
        CarFunctionFactory  carFunctionFactory = new KaluolaCarFactory();
        Car car = carFunctionFactory.getCar();
        car.myName();

    }
}
