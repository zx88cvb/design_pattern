package com.angel.design.pattern.creational.abstractfactory;

/**
 * 抽象工厂
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.getArticle().product();
    }
}
