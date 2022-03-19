package com.study.leetcode;

/**
 * @program: LeetCode
 * @description:
 * @author: yangyb
 * @create: 2022-01-09 23:53
 **/
public class AllSort {


    public static char[] chars = {'0', '1', '2', '3'};

    public static boolean check(String s) {
        return true;
    }

    public static void dfs(char[] chars, int k) {
        if (k == chars.length) {
            String s = new String(chars);
            if (check(s)) {
                System.out.println(s);
            }
        }
        for (int i = k; i < chars.length; i++) {
            char temp = chars[k];
            chars[k] = chars[i];
            chars[i] = temp;
            dfs(chars, k + 1);
            temp = chars[k];
            chars[k] = chars[i];
            chars[i] = temp;
        }
    }

    public static void main(String[] args) {
        dfs(chars, 0);
    }

}
