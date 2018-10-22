package com.angel.design.pattern.creational.builder;

/**
 * 建造者
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("courseName", "coursePPT", "courseVideo", "courseArticle", "courseQA");
        System.out.println(course);
    }
}
