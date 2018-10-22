package com.angel.design.pattern.creational.simplefactory;

/**
 * 简单工厂
 */
public class Test {
    public static void main(String[] args) {
        /*Video video = new JavaVideo();
        video.product();*/

        /*VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.product();
        video = videoFactory.getVideo("python");
        video.product();*/

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        video.product();
    }
}
