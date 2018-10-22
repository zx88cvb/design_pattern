package com.angel.design.pattern.creational.abstractfactory;

/**
 * 课程工厂
 */
public interface CourseFactory {

    /**
     * 视频
     * @return Video
     */
    Video getVideo();

    /**
     * 手记
     * @return Article
     */
    Article getArticle();
}
