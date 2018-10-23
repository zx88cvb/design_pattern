package com.angel.design.pattern.creational.singleton;

import java.io.*;

/**
 * 单例模式
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();

        t2.start();

        System.out.println("main end");

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        stream(hungrySingleton);
    }

    /**
     * 流读取对象 破坏Singleton 以及解决
     * @param hungrySingleton hungrySingleton对象
     * @throws IOException 异常
     * @throws ClassNotFoundException 异常
     */
    public static void stream(HungrySingleton hungrySingleton) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(hungrySingleton);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(hungrySingleton);
        System.out.println(newInstance);
        System.out.println(hungrySingleton == newInstance);
    }
}
