package com.factory.base.abstarct;

import com.factory.base.BiaozhiCar;
import com.factory.base.Car;
import com.factory.base.KaluolaCar;
import com.factory.base.func.CarFunctionFactory;
import com.factory.base.func.DaZhongCarFactory;
import com.factory.base.simple.BiekeCar;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public class DefaultCarFactory extends AbstarctCarFactory {
    @Override
    public Car getBiaozhiCar() {
        return new BiaozhiCar();
    }

    @Override
    public Car getDaZhongCar() {
        CarFunctionFactory carFunctionFactory = new DaZhongCarFactory();
        return carFunctionFactory.getCar();
    }

    @Override
    public Car getKaluolaCar() {
        return new KaluolaCar();
    }

    /**
     * 在这个里面生成别克汽车
     * @return
     */
    @Override
    public Car getBiekeCar() {
        return new BiekeCar();
    }
}
