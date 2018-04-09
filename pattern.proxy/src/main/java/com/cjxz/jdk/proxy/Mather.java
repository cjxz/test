package com.cjxz.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/8
 * @Version: 1.0
 */
public class Mather implements InvocationHandler {
    private Person person;
    public Object getInstence(Person person){
        this.person = person;
        Class clazz = this.person.getClass();
        //JDK动态代理实例一个对象
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("开始找对象，请提出对象要求");
        method.invoke(person, args);
        System.out.println("找完了对象");
        return null;
    }
}
