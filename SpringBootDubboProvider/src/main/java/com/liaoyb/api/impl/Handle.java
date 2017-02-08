package com.liaoyb.api.impl;

import java.util.ArrayList;
import java.util.List;

import com.liaoyb.Mod;
import com.liaoyb.api.IHandle;

/**
 * 要实现序列化接口
 * @author ybliao2
 */
public class Handle implements IHandle {
    @Override
    public String fun1() {
        return "Hello this my function fun1";
    }

    @Override
    public String fun2(int i) {
       return "you input param's value is:"+i;
    }

    @Override
    public List<Mod> gainMods() {
        List<Mod> mods=new ArrayList<>();
        Mod mod=new Mod();
        mod.setName("涛逼");
        mod.setAge(20);

        Mod mod1=new Mod();
        mod1.setName("红鸡鸡");
        mod1.setAge(100);
        mods.add(mod1);
        return mods;
    }
}
