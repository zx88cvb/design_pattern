package com.angel.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式 类加载就初始化
 */
public class HungrySingleton implements Serializable{
    private static final HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        // 防御反射调用
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
