package com.angel.design.principle.dependenceinversion;

/**
 * @Author: Angel
 * @Date: 2018/10/16.
 * @Description:
 */
public class JavaCourse implements ICourse {
    @Override
    public void stydyCourse() {
        System.out.println("我在学习Java课程");
    }
}
