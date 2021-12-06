package com.example.learn.learn.io;


import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URI;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 马金文
 * @Date: 2021/11/11 9:10
 * @Description:
 */
public class FileTest {
    public static void main(String[] args) throws Exception {
//        File file1=new File("D:\\zs\\file\\新建文件夹\\991b204e-6610-41f0-b210-26dcb03dce36.jpg");
//        FileInputStream inputStream=new FileInputStream(file1);
//        byte[] bytes = IOUtils.toByteArray(inputStream);
//        String newNmae= UUID.randomUUID().toString()+".jpg";
//        IOUtils.write(bytes,new FileOutputStream(new File("D:\\zs\\file\\新建文件夹\\"+newNmae)));

        ThreadPoolExecutor pool1=new ThreadPoolExecutor(10,10,6000,TimeUnit.MILLISECONDS,new ArrayBlockingQueue<>(10));
        Test t1=new Test();
        pool1.execute(t1);
        pool1.shutdown();
    }

    public static class Test implements Runnable {
        @Override
        public void run() {
            System.out.println("1234");
        }
    }
}
