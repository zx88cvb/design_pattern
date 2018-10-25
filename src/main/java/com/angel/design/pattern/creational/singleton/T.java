package com.angel.design.pattern.creational.singleton;

public class T implements Runnable {
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName()+"-----"+instance);
    }
}
