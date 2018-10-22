package com.angel.design.pattern.creational.builder;

public class CourseActualBuilder extends CourseBuilder{

    private Course course = new Course();

    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    public Course makeCourse() {
        return course;
    }
}
