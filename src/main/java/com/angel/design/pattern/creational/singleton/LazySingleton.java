package com.angel.design.pattern.creational.singleton;

/**
 * 懒汉式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public synchronized static LazySingleton getInstance() {
        // 多线程情况下 线程不安全 解决加上 synchronized
        if (lazySingleton == null) {
            lazySingleton =  new LazySingleton();
        }
        return lazySingleton;
    }
}
