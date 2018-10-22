package com.angel.design.pattern.creational.simplefactory;

/**
 * 工厂类
 */
public class VideoFactory {

    /**
     * V1 简单工厂
     * @param type 类型
     * @return 返回Video
     */
    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    /**
     * V2 简单工厂
     * @param clazz class
     * @return 返回video
     */
    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
