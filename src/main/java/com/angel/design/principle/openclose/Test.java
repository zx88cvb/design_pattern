package com.angel.design.principle.openclose;

/**
 * @Author: Angel
 * @Date: 2018/10/16.
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1, "课程111", 998.00);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        System.out.println(javaDiscountCourse.getId()+"----"+javaDiscountCourse.getName()+"------"+javaDiscountCourse.getPrice()+"------"+javaDiscountCourse.getOriPrice());
    }
}
