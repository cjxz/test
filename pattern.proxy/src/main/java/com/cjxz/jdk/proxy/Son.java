package com.cjxz.jdk.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/8
 * @Version: 1.0
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("找对象要求：漂亮");
    }

    @Override
    public void findJob() {
        System.out.println("找IT工作");
    }
}
