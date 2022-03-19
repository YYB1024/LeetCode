package com.study.leetcode;

import java.util.Scanner;

/**
 * @program: LeetCode
 * @description: 求最小公倍数和最大公约数
 * @author: yangyb
 * @create: 2022-01-04 15:20
 **/
public class MultipleNumber {
    /*
      欧几里得公式：ab最小公倍数 = |a*b| / gcd(a,b)  注:gcd(a,b)最大公约数
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        System.out.println("最大公约数=" + gcd(a, b));
        System.out.println("最小公倍数=" + a * b / gcd(a, b));
    }

    private static Integer gcd(Integer a, Integer b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
