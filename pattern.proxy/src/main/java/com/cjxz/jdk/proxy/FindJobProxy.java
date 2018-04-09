package com.cjxz.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/9
 * @Version: 1.0
 */
public class FindJobProxy implements InvocationHandler {
    private Person target;

    public Object getInstence(Person person){
        this.target = person;
        Class clazz = this.target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是负责帮你找工作的");
        method.invoke(target,args);
        System.out.println("我知道你的工作要求了");
        return null;
    }
    //原理：
    //1.拿到被代理对象的引用，并且获取到它的所有接口，反射获得
    //2.JDK Proxy类重新生成一个新的类，同时新的类要实现被代理类的所有实现
    //3.把新加的业务逻辑方法有一定的逻辑代码去调用
    //4.编译成新的java代码
    //5.在重新加载上面生成的class文件
}
