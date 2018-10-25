package com.angel.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例模式
 */
public class ContainerSingleton {
    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    private ContainerSingleton() {
    }

    /**
     * 往map容器中存入key value
     * @param key 键
     * @param value 值
     */
    public static void putInstance(String key, Object value) {
        if (StringUtils.isNotBlank(key) || value !=null) {
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key, value);
            }
        }
    }

    /**
     * 通过key获取单例对象
     * @param key 键
     * @return 返回map值
     */
    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
