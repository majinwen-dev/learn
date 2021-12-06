package com.example.learn.learn.task;

import org.springframework.stereotype.Service;

/**
 * @Author: 马金文
 * @Date: 2021/10/19 10:18
 * @Description:
 */
@Service("scheduleTest2")
public class ScheduleTestImpl2 implements ScheduleTestService{
    @Override
    public void test(ScheduleConfigDO scheduleConfig) {
        System.out.println(scheduleConfig);
        System.out.println("hello  world 2");
    }
}
