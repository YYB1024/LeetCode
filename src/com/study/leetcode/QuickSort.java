package com.study.leetcode;

/**
 * @program: LeetCode
 * @description: 快速排序
 * @author: yangyb
 * @create: 2022-01-04 15:51
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {4, 2, 6, 8, 5, 0, 7};
        System.out.print("排序前");
        foreachs(array);
        QuickSorts(array, 0, array.length - 1);
        System.out.println("排序后");
        foreachs(array);
    }

    private static void QuickSorts(int[] array, int L, int R) {
        //先定义左边下标<右边下标
        if (L > R) {
            return;
        }
        //定义比较的索引下标
        int left = L, right = R;
        //将数组的任意一个数作为中间轴pivot（每次从左边获取）
        int pivot = array[left];
        //下标比较
        while (left < right) {
            /*仅对于中间以右的情况*/
            //R 从右往左移动的情况(中间抽为分割线)
            //左边的下标<右边的下标 并且右边的值>=中间值
            while (left < right && array[right] >= pivot) {
                //R 从右往左移动,下标递减
                right--;
            }
            if (left < right) {
                //R扫描的值比pivot值小就把该值（右边的数）放在数组序列的左边
                array[left] = array[right];
            }


            //L 从左往右移动的情况
            while (left < right && array[left] <= pivot) {
                //L 从左往右移动,下标递增
                left++;
            }
            if (left < right) {
                //L 扫描的值比pivot值大就把该值（左边的数）放在数组序列的右边
                array[right] = array[left];
            }
            /*重合的情况*/
            //R 下标，L 下标在数组序列中某个位置重合时
            if (left >= right) {
                //把pivot值放在该处
                array[left] = pivot;
            }

        }

        //左子序列递归
        QuickSorts(array, L, right - 1);
        //右子序列递归
        QuickSorts(array, right + 1, R);

    }

    private static void foreachs(int[] array) {
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
    }
}
