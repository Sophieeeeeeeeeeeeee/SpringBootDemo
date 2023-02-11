package com.common.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: csy
 * @Description: 数据类型转换工具类
 */

@Lazy
@Component
public class ConvertUtils {

    /**
     * @param object 对象类
     * @Description: 将对象转换为 map
     */
    public Map<String, Object> objectToMap(Object object) {
        Map<String, Object> map = new HashMap<>();
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                map.put(field.getName(), field.get(object));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    /**
     * @param map map类
     * @param clazz 对象类
     * @Description: 将 map 转换为对象
     */
    public <T> T mapToObject(Map<Object, Object> map, Class<T> clazz) {
        T object = null;
        try {
            object = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                field.set(object, map.get(field.getName()));
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return object;
    }
}
