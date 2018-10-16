package com.angel.design.principle.dependenceinversion;

/**
 * @Author: Angel
 * @Date: 2018/10/16.
 * @Description:
 */
public class FECourse implements ICourse {
    @Override
    public void stydyCourse() {
        System.out.println("我在学习前端课程");
    }
}
