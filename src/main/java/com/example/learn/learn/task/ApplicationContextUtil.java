package com.example.learn.learn.task;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 马金文
 * @Date: 2021/10/19 9:38
 * @Description:
 */
@Component
@Data
public class ApplicationContextUtil {

    @Autowired
     Map<String, ScheduleTestService> serviceMap = new ConcurrentHashMap<>();

    public ScheduleTestService getBean(String className) {
        if (serviceMap.containsKey(className)) {
            return serviceMap.get(className);
        }
        return null;
    }
}
