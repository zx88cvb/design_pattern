package com.angel.design.principle.dependenceinversion;

/**
 * 依赖倒置原则讲解
 * @Author: Angel
 * @Date: 2018/10/16.
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        // v1
        /*Mine mine = new Mine();
        mine.stydyJavaCourse();
        mine.stydyFECourse();*/

        // V2
        /*Mine mine = new Mine();
        mine.study(new JavaCourse());
        mine.study(new FECourse());*/

        // V3
        /*Mine mine = new Mine(new JavaCourse());
        mine.study();*/

        Mine mine = new Mine();
        mine.setiCourse(new JavaCourse());
        mine.study();
        mine.setiCourse(new FECourse());
        mine.study();
    }
}
