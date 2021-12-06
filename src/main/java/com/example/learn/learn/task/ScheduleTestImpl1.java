package com.example.learn.learn.task;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: 马金文
 * @Date: 2021/10/19 9:51
 * @Description:
 */
@Service("scheduleTest1")
public class ScheduleTestImpl1 implements ScheduleTestService{

    @Override
    public void test(ScheduleConfigDO scheduleConfig){
        System.out.println(scheduleConfig);
        System.out.println("hello  world 1");
    }
}
