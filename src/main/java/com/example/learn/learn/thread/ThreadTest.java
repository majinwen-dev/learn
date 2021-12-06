package com.example.learn.learn.thread;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 马金文
 * @Date: 2021/10/22 15:52
 * @Description:
 */
public class ThreadTest {

    public static void main(String[] args) {

        // 创建线程池
        ThreadPoolExecutor executor=new ThreadPoolExecutor(100,
                150,
                600L,
                TimeUnit.MICROSECONDS,
                new ArrayBlockingQueue<>(50));

        // 创建任务
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("任务执行了");
            }
        };

        // 提交任务
        executor.execute(runnable);
    }


}
