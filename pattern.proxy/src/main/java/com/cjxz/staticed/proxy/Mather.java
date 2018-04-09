package com.cjxz.staticed.proxy;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/8
 * @Version: 1.0
 */
public class Mather {
    //静态代理通过组合方式将目标类的引用加进来
    private Son son;
    public Mather(Son son){
        this.son = son;
    }

    /**
     * 在调用target对象前和后做一些处理。
     * 但是在son进行功能增强时，代理类需要重新增加方法。依赖性比较强
     */
    public void findLove(){
        System.out.println("物色对象");
        this.son.findLove();
        System.out.println("父母见面");
    }
}
