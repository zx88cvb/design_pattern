package com.angel.design.principle.dependenceinversion;

/**
 *
 * @Author: Angel
 * @Date: 2018/10/16.
 * @Description:
 */
public class Mine {


    /*public void stydyJavaCourse() {
        System.out.println("我在学习Java课程");
    }

    public void stydyFECourse() {
        System.out.println("我在学习前端课程");
    }*/

    // v2
    /*public void study(ICourse iCourse){
        iCourse.stydyCourse();
    }*/

    // v3
    /*private ICourse iCourse;

    public Mine(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
        iCourse.stydyCourse();
    }*/

    // V4
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
        iCourse.stydyCourse();
    }
}
