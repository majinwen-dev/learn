package com.example.learn.learn.task;

import com.example.learn.learn.domain.User;

/**
 * @Author: 马金文
 * @Date: 2021/11/19 13:14
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadTest1 t1=new ThreadTest1();
        t1.start();

    }




    public  static class ThreadTest1 extends  Thread{
        @Override
        public void run() {
            System.out.println("线程1");
        }


    }
}
