package com.angel.design.pattern.creational.factorymethod;

/**
 * 工厂
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.video();
        video.product();
    }
}
