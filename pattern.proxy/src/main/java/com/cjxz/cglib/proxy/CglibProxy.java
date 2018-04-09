package com.cjxz.cglib.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/9
 * @Version: 1.0
 */
public class CglibProxy implements MethodInterceptor{
    public Son getIntence(Class clazz)throws Exception{
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return (Son)enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("提出找对象的要求");
        methodProxy.invokeSuper(o,objects);
        System.out.println("我知道了");
        return null;
    }
}
