package com.angel.design.pattern.creational.singleton;

/**
 * ThreadLocal线程单例
 * 隔离多个线程访问控制
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocal =
            new ThreadLocal<ThreadLocalInstance>(){
                @Override
                protected ThreadLocalInstance initialValue() {
                    return new ThreadLocalInstance();
                }
            };

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance(){
        return threadLocal.get();
    }
}
