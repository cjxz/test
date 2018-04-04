package com.factory.base.abstarct;

import com.factory.base.Car;

/**
 * @Author: chao.zhu
 * 抽象类提供创建不同类型的car，这个方式是对客户使用的。当我们增加一种类型的car只需要增加一个抽象方法
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public abstract class AbstarctCarFactory {
    /**
     * 标致汽车
     * @return
     */
    public abstract Car getBiaozhiCar();
    /**
     * 大众汽车
     * @return
     */
    public abstract Car getDaZhongCar();
    /**
     * 卡罗拉汽车
     * @return
     */
    public abstract Car getKaluolaCar();

    /**
     * 新增的别克类型的汽车
     * @return
     */
    public abstract Car getBiekeCar();
    public void log(){
        System.out.println("公共的逻辑");
    }
}
