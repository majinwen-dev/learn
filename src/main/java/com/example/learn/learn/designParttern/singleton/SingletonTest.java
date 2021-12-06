package com.example.learn.learn.designParttern.singleton;

/**
 * @Author: 马金文
 * @Date: 2021/11/9 16:32
 * @Description:
 */
public class SingletonTest {

    private static SingletonTest instance = null;

    // 构造方法私有
    private SingletonTest() {
    }

    private synchronized static void init() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }

    private static SingletonTest getInstance() {
        if (instance == null) {
            init();
        }
//        System.out.println(instance);
        return instance;
    }

    public static void main(String[] args) {
        SingletonTest instance = SingletonTest.getInstance();
        System.out.println(instance);
    }

}
