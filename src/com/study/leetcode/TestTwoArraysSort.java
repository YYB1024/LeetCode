package com.study.leetcode;

import java.util.HashMap;

/**
 * @program: LeetCode
 * @description:
 * @author: yangyb
 * @create: 2022-01-09 23:28
 **/
public class TestTwoArraysSort {
    public static void main(String[] args) {
        //1、初始化两数组
        int[] one = new int[]{1, 2, 4, 6, 8, 55, 66, 78};
        int[] two = new int[]{0, 2, 6, 8, 90, 222, 345};
        int[] three = addTwoArraysSort(one, two);
        for (int i : three) {
            System.out.print(i + ",");
        }
        HashMap stringHashMap = new HashMap<>();

    }

    private static int[] addTwoArraysSort(int[] one, int[] two) {
        int[] three = new int[one.length + two.length];
        //分别定义两数组的下标
        int a = 0, b = 0;
        for (int i = 0; i < three.length; i++) {
            //主要是对下标与数组长度比较
            if (a < one.length && b < two.length) {
                if (one[a] > two[b]) {
                    three[i] = two[b];
                    b++;
                } else {
                    three[i] = one[a];
                    a++;
                }
                //two数组已经遍历完了，one数组还没遍历完
            } else if (a < one.length) {
                three[i] = one[a];
                a++;
            } else if (b < two.length) {
                three[i] = two[b];
                b++;
            }

        }
        return three;
    }


}
