package com.factory.base.func;

import com.factory.base.Car;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public interface CarFunctionFactory {
    /**
     * 每个厂家的车子制造过程都不相同，将做一个工厂接口。来生产不同类型的车子
     * @return
     */
    Car getCar();
}
