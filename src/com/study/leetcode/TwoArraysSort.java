package com.study.leetcode;

/**
 * @program: LeetCode
 * @description: 两有序数组合并为一个有序数组
 * @author: yangyb
 * @create: 2022-01-09 23:12
 **/
public class TwoArraysSort {
    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 4, 6, 7, 8};
        int[] num2 = new int[]{2, 4, 6, 7, 8, 9, 10};

        int a = 0, b = 0;
        //定义一个新的数组，存放合并的数据
        int[] num3 = new int[num1.length + num2.length];
        //遍历
        for (int i = 0; i < num3.length; i++) {
            if (a < num1.length && b < num2.length) {
                if (num1[a] > num2[b]) {
                    //小的先加入
                    num3[i] = num2[b];
                    b++;
                } else {
                    num3[i] = num1[a];
                    a++;
                }
            } else if (a < num1.length) {
                //长度赋值
                num3[i] = num1[a];
                a++;
            } else if (b < num2.length) {
                num3[i] = num2[b];
                b++;
            }
        }
        for (int i = 0; i < num3.length; i++) {
            System.out.println(num3[i]);

        }
    }
}
