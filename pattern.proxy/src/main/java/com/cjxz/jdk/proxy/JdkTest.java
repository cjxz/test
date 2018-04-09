package com.cjxz.jdk.proxy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import sun.misc.ProxyGenerator;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/8
 * @Version: 1.0
 */
public class JdkTest {
    public static void main(String[] args)throws Exception {
//        Son o = (Son)new Mather().getInstence(new Son());
//        o.findLove();

        FindJobProxy findJobProxy = new FindJobProxy();
        Person p = (Person) findJobProxy.getInstence(new Son());

//        out.writeObject(p.getClass().);


//        System.out.println(p.getClass());
//        p.findJob();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});

        File file = new File("/自我升华/java架构师视频/03.深度分析代理模式/$Proxy0.class");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        fileOutputStream.close();
//        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);


    }
}
