package com.example.learn.learn.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

/**
 * @Author: 马金文
 * @Date: 2021/10/19 9:30
 * @Description: ScheduleTaskComponent 定时任务管理类
 */
@Component
@Slf4j
public class ScheduleTaskComponent {

    /**
     *  保存任务
      */
    private Map<String, ScheduledFuture<?>> futuresMap = new ConcurrentHashMap<String, ScheduledFuture<?>>();

    /**
     * 创建ThreadPoolTaskScheduler线程池
     */
    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

    @Autowired
    ApplicationContextUtil applicationContextUtil;
    /**
     * 初始化任务
     */
    @PostConstruct
    public void initSchedule() {
        // 查库找到所有的任务
        List<ScheduleConfigDO> list = new ArrayList<>();
        list.add(new ScheduleConfigDO(){{
            setClassName("scheduleTest1");
            String cron="0 1 14 * * ?";
            setCron(cron);
            setEnabled(1);
            setMethod("test");
            setJobName("test1");
        }});
        list.add(new ScheduleConfigDO(){{
            setClassName("scheduleTest2");
            String cron="0 2 14 * * ?";
            setCron(cron);
            setEnabled(1);
            setMethod("test");
            setJobName("test2");
        }});
        for (ScheduleConfigDO config : list) {
            ScheduledFuture<?> future = threadPoolTaskScheduler.schedule(getRunnable(config), getTrigger(config));
            futuresMap.put(config.getJobName(), future);
        }
    }

    /**
     * 暂停任务
     *
     * @param key
     * @return
     */
    public boolean pauseeTask(String key) {
        ScheduledFuture toBeRemovedFuture = futuresMap.remove(key);
        if (toBeRemovedFuture != null) {
            toBeRemovedFuture.cancel(true);
            return true;
        } else {
            return false;
        }
    }

    /**
     * 添加任务
     *
     * @param config
     */
    public void addTask(ScheduleConfigDO config) {
        ScheduledFuture<?> future = threadPoolTaskScheduler.schedule(getRunnable(config), getTrigger(config));
        futuresMap.put(config.getJobName(), future);
    }


    /**
     * 更新任务
     *
     * @param config
     */
    public void updateTask(ScheduleConfigDO config) {
        ScheduledFuture toBeRemovedFuture = futuresMap.remove(config.getJobName());
        if (toBeRemovedFuture != null) {
            toBeRemovedFuture.cancel(true);
        }
        addTask(config);
    }


    /**
     * 转换首字母小写
     *
     * @param str
     * @return
     */
    public static String lowerFirstCapse(String str) {
        char[] chars = str.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }


    /**
     * //反射使用newInstance静态方法来实例化对象 获取不了spring中注入的对象
     * runnable
     *
     * @param scheduleConfig
     * @return
     */
    private Runnable getRunnable(ScheduleConfigDO scheduleConfig) {
        return new Runnable() {
            @Override
            public void run() {
                Class<?> clazz;
                try {
                    //注意这里如果@Service注解没指定名字，生成的默认首字母小写
                    Object o = applicationContextUtil.getBean(scheduleConfig.getClassName());
                    clazz = o.getClass();
                    Method method = clazz.getMethod(scheduleConfig.getMethod(),ScheduleConfigDO.class);
                    //method.invoke(clazz.newInstance());
                    method.invoke(o,scheduleConfig);
                } catch (Exception e) {
                    log.error(e.getMessage());
                }
            }
        };
    }

    /**
     * Trigger
     *
     * @param scheduleConfig
     * @return
     */
    private Trigger getTrigger(ScheduleConfigDO scheduleConfig) {
        return new Trigger() {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext) {
                CronTrigger trigger = new CronTrigger(scheduleConfig.getCron());
                Date nextExec = trigger.nextExecutionTime(triggerContext);
                return nextExec;
            }
        };
    }
}


