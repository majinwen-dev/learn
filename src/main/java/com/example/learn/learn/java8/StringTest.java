package com.example.learn.learn.java8;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: majinwen
 * @Date: 2021/7/23-13:37
 * @Description:
 */
public class StringTest {
    public static void main(String[] args) {

//        String msg = "{0}{1}{2}{3}{4}{5}{6}{7}{8}";
//        Object [] array = new Object[]{"A","B","C","D","E","F","G","H","I",};
//        String value = MessageFormat.format(msg, array);
//        System.out.println(value);
//
//
//        String ss = MessageFormat.format("{0} {1,date,yyyy-MM-dd HH:mm:ss}", "张三", new Date());
//        System.out.println(ss);
//
//        System.out.println(MessageFormat.format("{0}{1}", "张三", "是傻逼"));
//
//        System.out.println(MessageFormat.format("sss {0,number,#.##} 一斤", Double.valueOf("22.3333")));


        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).collect(Collectors.toList());


        System.out.println(squaresList);
    }
}
