package com.factory.base.func;

import com.factory.base.Car;
import com.factory.base.DaZhongCar;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public class DaZhongCarFactory implements CarFunctionFactory {
    @Override
    public Car getCar() {
        return new DaZhongCar();
    }
}
