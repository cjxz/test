package com.base.vo;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/5
 * @Version: 1.0
 */
public class TestDeep {
    public static void main(String[] args) throws CloneNotSupportedException {
        SunWuKong s = new SunWuKong();
        SunWuKong s1 = (SunWuKong) s.clone();
//        s1.h = 200;
//        s1.jinGubang.h = 1000;
        System.out.println(s.h);
        System.out.println(s1.h );
        System.out.println(s.w == s1.w);
        System.out.println(s.jinGubang == s1.jinGubang);
        System.out.println(s == s1);
//        System.out.println(s1.jinGubang.h);

    }
}
