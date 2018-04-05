package com.base.vo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chao.zhu
 * @Email: chao.zhu@rograndec.com
 * @CreateDate: 2018/4/5
 * @Version: 1.0
 */
public class SunWuKong implements Cloneable,Serializable{
    public Integer      h;
    public int          w;
    public JinGubang    jinGubang;
    public List<String> hanMao;
    public SunWuKong(){
        this.h = new Integer(100);
        this.w = 20;
        this.jinGubang = new JinGubang();
        this.hanMao = new ArrayList<>();
        this.hanMao.add("第一根");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

//        try {
//            return copy();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return  null;
    }

    public Object copy() throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        SunWuKong s = (SunWuKong) ois.readObject();
        return s;

    }
}
