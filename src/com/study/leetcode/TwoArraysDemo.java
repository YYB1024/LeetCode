package com.study.leetcode;

/**
 * @program: LeetCode
 * @description:
 * @author: yangyb
 * @create: 2022-01-14 17:06
 **/
public class TwoArraysDemo {
    public static void main(String[] args) {
        int[] one = new int[]{2, 4, 5, 6, 7};
        int[] two = new int[]{1, 3, 4, 5, 6};
        int[] sort = getSort(one, two);
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }

    private static int[] getSort(int[] one, int[] two) {
        //a,b分别为下标
        int a = 0, b = 0;
        int[] three = new int[one.length + two.length];
        for (int i = 0; i < three.length; i++) {
            if (one[a] > two[b]) {
                three[i] = two[b];
                b++;
            } else if (two[b] > one[a]) {
                three[i] = one[a];
                a++;
            } else if (one[a] == two[b]) {
                three[i] = two[b];


            }

        }
        return three;

    }


}
