package com.angel.design.pattern.creational.factorymethod;

public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video video() {
        return new JavaVideo();
    }
}
