package com.example.learn.learn.mhs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 马金文
 * @Date: 2021/9/7 14:13
 * @Description:
 */
public class PxTest {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;
        // 添加元素
        String[] arr = new String[100000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(i);
        }

        // 第一种方式转换成集合
        start = System.currentTimeMillis();
        List<String> strings = Arrays.asList(arr);
        end = System.currentTimeMillis();
        System.out.println("第一种方式转换成集合时间");
        System.out.println(end - start);

        // 第二种防水转换成集合
        start = System.currentTimeMillis();
        List<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
        end = System.currentTimeMillis();
        System.out.println("第二种方式转换成集合时间");
        System.out.println(end - start);


        //第三种方式
        start = System.currentTimeMillis();
        List<String> list = new ArrayList<>(arr.length);
        Collections.addAll(list, arr);
        end = System.currentTimeMillis();
        System.out.println("第三种方式转换成集合时间");
        System.out.println(end - start);
    }

    public static void insertSort() {
        int[] array = new int[]{1, 20, 55, 8, 99, 11};
        //第0位独自作为有序数列，从第1位开始向后遍历
        for (int i = 1; i < array.length; i++) {
            //0~i-1位为有序，若第i位小于i-1位，继续寻位并插入，否则认为0~i位也是有序的，忽略此次循环，相当于continue
            if (array[i] < array[i - 1]) {
                //保存第i位的值
                int temp = array[i];
                int j = i - 1;
                //从第i-1位向前遍历并移位，直至找到小于第i位值停止
                while (j >= 0 && temp < array[j]) {
                    array[j + 1] = array[j];
                    j--;
                }
                //插入第i位的值
                array[j + 1] = temp;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
    }


    // 请把字符串数组转list
    public List<String> arrToListStr(String[] arr) {
        return Arrays.asList(arr);
    }

    // 请把字符串list转数组
    public String[] listToArrStr(List<String> list) {
        return (String[]) list.toArray();
    }

    // 请把list数组转成int[]
    public List<Integer> arrToListInt (List<Integer> num) {
        return num.stream().collect(Collectors.toList());
    }

    // 请把int[] 数组转成list
    public List<Integer> arrToListInt (int[] num) {
        return Arrays.stream(num).mapToObj(Integer::valueOf).collect(Collectors.toList());
    }


}
