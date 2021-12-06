package com.example.learn.learn.java8;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Author: majinwen
 * @Date: 2021/7/22-16:01
 * @Description:
 */
public class IoTest {
    public static void main(String[] args) throws IOException {
        //文件路径
        String filpath="D:\\zs\\file\\nmjfsjhj.sql";
        // 文件后缀获取
        int i = filpath.lastIndexOf(".");
        String suffix = filpath.substring(i, filpath.length());
        // 新的文件基础路径
        String newFileBasePath="D:\\zs\\file\\tytjtp\\";

        SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");
        String addPath=df.format(new Date());
        newFileBasePath=newFileBasePath+"\\"+addPath+"\\";
        File file=new File(newFileBasePath);
        // 文件路径不存在,创建一下
        if(!file.exists()){
            boolean mkdir = file.mkdir();
        }
        // 新的文件路径
        String newFilePath=newFileBasePath+ UUID.randomUUID().toString()+suffix;

        byte[] bytes = InputStream2ByteArray(filpath);
        IOUtils.write(bytes,new FileOutputStream(new File(newFilePath)));
        newFilePath=newFileBasePath+ UUID.randomUUID().toString()+suffix;
        FileUtils.writeByteArrayToFile(new File(newFilePath),bytes);
    }

    private static byte[] InputStream2ByteArray(String filePath) throws IOException {
        InputStream in = new FileInputStream(filePath);
        byte[] data = toByteArray(in);
        in.close();
        return data;
    }

    private static byte[] toByteArray(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024 * 4];
        int n = 0;
        while ((n = in.read(buffer)) != -1) {
            out.write(buffer, 0, n);
        }
        return out.toByteArray();
    }
}