package com.example.learn.learn.utils;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.sql.SQLOutput;
import java.util.UUID;

/**
 * @Author: majinwen
 * @Date: 2021/8/19-14:20
 * @Description:
 */
public class LearnIoUtils {

    public static void main(String[] args) throws IOException {

        StringBuilder basePath = new StringBuilder("D:/zs/file/test");
        File base = new File("D:/zs/file/test");
        if (!base.exists()) {
            base.mkdir();
        }
        File f2 = new File("D:/zs/file/test/微信图片_20210519143517.jpg");
        FileInputStream input1 = new FileInputStream(new File("D:/zs/file/test/微信图片_20210519143517.jpg"));
        String[] split = f2.getPath().split("\\.");
        if (!basePath.toString().endsWith("/")) {
            basePath.append("/");
        }

        FileInputStream input2  =new FileInputStream(new File("C:\\Users\\majinwen\\Desktop\\新建文本文档 (2).txt"));
//        IOUtils.write(IOUtils.toByteArray(input1),new FileOutputStream(new File(basePath.append(UUID.randomUUID().toString()).append(".").append(split[1]).toString())));
        String context = IOUtils.toString(input2,"utf-8");
        System.out.println(context);

        String string = IOUtils.toString(input1,"utf-8");
        byte[] bytes = string.getBytes();

        // 大小 6858617  3786374
        FileOutputStream fileOutputStream = new FileOutputStream(new File(basePath.append(UUID.randomUUID().toString()).append(".").append(split[1]).toString()));

//        IOUtils.copy(input1,fileOutputStream);
//        IOUtils.write(bytes,fileOutputStream);
        //关闭io流
        IOUtils.closeQuietly(input1);
        IOUtils.closeQuietly(fileOutputStream);

    }
}
