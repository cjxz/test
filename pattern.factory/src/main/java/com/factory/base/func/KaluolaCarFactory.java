package com.factory.base.func;

import com.factory.base.Car;
import com.factory.base.KaluolaCar;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public class KaluolaCarFactory implements CarFunctionFactory {
    /**
     * 卡罗拉工厂专门生产卡罗拉车型
     * @return
     */
    @Override
    public Car getCar() {
        return new KaluolaCar();
    }
}
