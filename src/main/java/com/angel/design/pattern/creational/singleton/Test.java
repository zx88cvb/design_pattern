package com.angel.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(instance);
        System.out.println(instance);
        System.out.println(instance);
        System.out.println(instance);

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();

        t2.start();

        System.out.println("main end");

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        stream(hungrySingleton);

        //ref();

        enmuSingleton();

        container();
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

    /**
     * 反射破坏单例模式 (仅用在类加载防御)
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void ref() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class objectClass = HungrySingleton.class;
        Class objectClass = StaticInnerClassSingleton.class;
        Constructor constructors = objectClass.getDeclaredConstructor();
        constructors.setAccessible(true);

        // 防御成功
        /*HungrySingleton newInstance = (HungrySingleton) constructors.newInstance();
        HungrySingleton objectSingleton = HungrySingleton.getInstance();*/

        // 防御成功
        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructors.newInstance();
        StaticInnerClassSingleton objectSingleton = StaticInnerClassSingleton.getInstance();

        // 懒汉式不能防御反射

        System.out.println(newInstance);
        System.out.println(objectSingleton);
        System.out.println(newInstance == objectSingleton);
    }

    public static void enmuSingleton() {
        EnumInstance instance = EnumInstance.getInstance();
        System.out.println(instance);
    }

    public static void container(){
        ContainerSingleton.putInstance("object", new Object());
        Object object = ContainerSingleton.getInstance("object");
        System.out.println(object);
    }
}
