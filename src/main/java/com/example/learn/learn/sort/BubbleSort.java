package com.example.learn.learn.sort;

/**
 * @Author: 马金文
 * @Date: 2021/11/18 16:47
 * @Description:
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3, 7, 9, 4, 4, 33, 6, 88, 94, 34, 56, 65, 43};
        int size = a.length;
        while (size > 1) {
            boolean flage = true;
            for (int i = 0; i < size - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flage = false;
                }
            }
            if (flage) {
                break;
            }
            size--;
        }
        for (int i : a) {
            System.out.println(i);
        }

    }
}
