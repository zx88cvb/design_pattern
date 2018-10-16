package com.angel.design.principle.openclose;

/**
 * 拓展 JavaCourse
 * @Author: Angel
 * @Date: 2018/10/16.
 * @Description:
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    /**
     * 原价
     * @return 返回double型原价
     */
    public Double getOriPrice() {
        return super.getPrice();
    }
}
