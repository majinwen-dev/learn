package com.example.learn.learn.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 马金文
 * @Date: 2021/10/18 13:39
 * @Description:
 */
public class ListArrayListUtils {
    // 请把字符串数组转list
    public static List<String> arrToListStr(String[] arr) {
        return  Arrays.asList(arr);
    }

    // 请把字符串list转数组
    public static String[] listToArrStr(List<String> list) {

        return list.toArray(new String[list.size()]);
    }

    // 请把list数组转成int[]
    public static int[] arrToListInt (List<Integer> num) {
        return num.stream().mapToInt(Integer::valueOf).toArray();
    }

    // 请把int[] 数组转成list
    public static List<Integer> arrToListInt (int[] num) {
        return Arrays.stream(num).boxed().collect(Collectors.toList());
    }


    public static void main(String[] args) {
        String[] strs={"212","323","434"};
        List<String> strings = arrToListStr(strs);
        System.out.println(strings);

        String[] strings1 = listToArrStr(Arrays.asList(strs));
        System.out.println(strings1);

    }
}
