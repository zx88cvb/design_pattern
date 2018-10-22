package com.angel.design.pattern.creational.factorymethod;

public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video video() {
        return new PythonVideo();
    }
}
