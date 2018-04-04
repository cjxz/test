package com.factory.base.simple;

import com.factory.base.Car;
import com.factory.base.DaZhongCar;
import com.factory.base.KaluolaCar;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/4
 * @Version: 1.0
 */
public class SimpleFactory {
    //通过传入不同的车辆标识来创建不同的汽车，用户需要知道创建的类型
    public Car getCar(String carName){
        if("dazhong".equals(carName)){
            return (new DaZhongCar());
        } else if("kaluola".equals(carName)){
            return new KaluolaCar();
        }else if("dazhong".equals(carName)){
            return new DaZhongCar();
        }else{
            return null;
        }
    }
}
