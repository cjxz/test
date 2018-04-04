package com.factory.base.abstarct;

import com.factory.base.Car;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public abstract class AbstarctCarFactory {
    /**
     * 抽象类提供创建不同类型的car
     * @return
     */
    public abstract Car getBiaozhiCar();
    public abstract Car getDaZhongCar();
    public abstract Car getKaluolaCar();
    public void log(){
        System.out.println("公共的逻辑");
    }
}
