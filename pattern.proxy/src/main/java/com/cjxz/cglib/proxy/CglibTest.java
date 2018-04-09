package com.cjxz.cglib.proxy;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/9
 * @Version: 1.0
 */
public class CglibTest {
    public static void main(String[] args) throws Exception {
        CglibProxy cglibProxy = new CglibProxy();
        Son o = cglibProxy.getIntence(Son.class);
        o.findLove();
    }
}
