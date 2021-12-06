package com.example.learn.learn.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @Author: majinwen
 * @Date: 2021/8/19-15:48
 * @Description:
 */
public class LearnFileUtils {
    public static void main(String[] args) throws IOException {
        File file=new File("D:/zs/file/bb");
        // 删除文件夹  删除的是最下面的文件夹
//        FileUtils.deleteDirectory(file);


        FileUtils.deleteQuietly(file);

        // 以字符形式读取文件内容
//        String string = FileUtils.readFileToString(new File("D:/zs/file/test/新建文本文档 (2).txt"));
//        System.out.println(string);

        //删除文件或文件夹且不会抛出异常
//        FileUtils.deleteQuietly(new File("D:/zs/file/test/新建文本文档 (2).txt"));


    }
}
