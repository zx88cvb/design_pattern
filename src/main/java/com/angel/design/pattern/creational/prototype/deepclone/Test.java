package com.angel.design.pattern.creational.prototype.deepclone;

import java.util.Date;

/**
 * 深克隆
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig = new Pig("pig", date);
        Pig clone = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(clone);

        pig.getBirthday().setTime(666666666666L);
        System.out.println(pig);
        System.out.println(clone);
    }
}
