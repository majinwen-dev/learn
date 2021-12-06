package com.example.learn.learn.sort;

/**
 * @Author: 马金文
 * @Date: 2021/11/18 15:58
 * @Description:
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] a = {3, 7, 9, 4, 4, 33, 6, 88, 94, 34, 56, 65, 43};
        for (int i = 0; i < a.length - 1; i++) {
            int end = i;
            while (end >= 0) {
                if (a[end + 1] > a[end]) {
                    int temp = a[end + 1];
                    a[end + 1] = a[end];
                    a[end] = temp;
                    end--;
                } else {
                    break;
                }
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
