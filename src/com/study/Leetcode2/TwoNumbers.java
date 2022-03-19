package com.study.Leetcode2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 两数之和，给定目标值，且返回下标
 * @author: yangyb
 * @create: 2022-02-01 21:08
 **/
public class TwoNumbers {
    public static void main(String[] args) {
        //int[] index = indexs(new int[]{2, 4, 4, 8}, 8);
        int[] index2 = indexs2(new int[]{2, 4, 4, 8}, 8);
        System.out.println(Arrays.toString(index2));

    }

    private static int[] indexs2(int[] nums, int target) {
        //数组大小
        int len = nums.length;
        //初始一个容量为len-1的哈希表
        Map<Integer, Integer> hashMap = new HashMap<>(len - 1);
        hashMap.put(nums[0], 0);
        for (int i = 1; i < len; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{i, hashMap.get(target - nums[i])};
            }
            hashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("ccc");

    }

    public static int[] indexs(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }

        }
        throw new IllegalArgumentException("ccc");
    }
}
