package com.study.leetcode;


import java.util.*;

/**
 * @program: LeetCode
 * @description: 求两个数组的交集、并集、差集
 * @author: yangyb
 * @create: 2022-01-02 15:57
 **/
public class Arrays {
    public static void main(String[] args) {
        //Integer[] numberOne={1,3,3,4,6,8};
        Integer[] numberOne = {1, 3, 6, 8, 9};
        //Integer[] numberTwo={2,3,3,5,8,6};
        Integer[] numberTwo = {2, 4, 6, 5};
        System.out.println("-----交集---------");
        //方法一：
        /*Integer[] addNumbers = getAdd(numberOne,numberTwo);
        for (Integer integer : addNumbers) {
            System.out.println(integer);
        }*/
        getAddList(numberOne, numberTwo);
        getChaList(numberOne, numberTwo);
        getSumList(numberOne, numberTwo);

        System.out.println("------并集----------");
        Integer[] sumNumbers = getSum(numberOne, numberTwo);
        for (Integer integer : sumNumbers) {
            System.out.println(integer);
        }
        System.out.println("------差集（属于A且不属于B的元素构成的集合）----------");
        Integer[] chaNumbers = getCha(numberOne, numberTwo);
        for (Integer integer : chaNumbers) {
            System.out.println(integer);
        }

    }


    //差集
    private static Integer[] getCha(Integer[] numberOne, Integer[] numberTwo) {

        //将较长的数组转换为set（{2,3,5,8,6}）
        Set<Integer> hashSet = new HashSet<Integer>(java.util.Arrays
                .asList(numberOne.length > numberTwo.length ? numberOne : numberTwo));
        //遍历最短的数组，减少循环次数（1,3,3,4,6,8）
        for (Integer i : numberOne.length > numberTwo.length ? numberTwo : numberOne) {
            // 如果集合里有相同的就删掉，如果没有就将值添加到集合
            if (hashSet.contains(i)) {
                hashSet.remove(i);
            }
        }
        Integer[] array = {};
        return hashSet.toArray(array);
    }

    private static Integer[] getSum(Integer[] numberOne, Integer[] numberTwo) {
        //将数组转换为set
        Set<Integer> one = new HashSet<Integer>(java.util.Arrays.asList(numberOne));
        Set<Integer> two = new HashSet<Integer>(java.util.Arrays.asList(numberTwo));
        //合并为一个set集合
        one.addAll(two);
        Integer[] array = {};
        return one.toArray(array);
    }

    //交集
    private static Integer[] getAdd(Integer[] numberOne, Integer[] numberTwo) {
        List<Integer> list = new ArrayList<>();

        //将较长的数组转换为set（{2,3,5,8,6}）
        Set<Integer> hashSet = new HashSet<Integer>(java.util.Arrays
                .asList(numberOne.length > numberTwo.length ? numberOne : numberTwo));
        //遍历最短的数组，减少循环次数（1,3,3,4,6,8）
        for (Integer i : numberOne.length > numberTwo.length ? numberTwo : numberOne) {
            if (hashSet.contains(i)) {
                list.add(i);
            }
        }
        Integer[] array = {};
        return list.toArray(array);
    }

    private static void getAddList(Integer[] numberOne, Integer[] numberTwo) {
        List<Integer> listOne = new ArrayList<>(numberOne.length);
        List<Integer> listTwo = new ArrayList<>(numberTwo.length);
        //经数组转换为list集合
        Collections.addAll(listOne, numberOne);
        Collections.addAll(listTwo, numberTwo);

        System.out.println("========方法二===========");
        //交集
        listOne.retainAll(listTwo);
        System.out.println("交集=" + listOne);


    }

    //差集
    private static void getChaList(Integer[] numberOne, Integer[] numberTwo) {
        List<Integer> listOne = new ArrayList<>(numberOne.length);
        List<Integer> listTwo = new ArrayList<>(numberTwo.length);
        //经数组转换为list集合
        Collections.addAll(listOne, numberOne);
        Collections.addAll(listTwo, numberTwo);

        System.out.println("========方法二===========");

        listOne.removeAll(listTwo);
        System.out.println("差集=" + listOne);


    }

    //并集
    private static void getSumList(Integer[] numberOne, Integer[] numberTwo) {
        List<Integer> listOne = new ArrayList<>(numberOne.length);
        List<Integer> listTwo = new ArrayList<>(numberTwo.length);
        //经数组转换为list集合
        Collections.addAll(listOne, numberOne);
        Collections.addAll(listTwo, numberTwo);

        System.out.println("========方法二===========");


        listOne.addAll(listTwo);
        System.out.println("并集=" + listOne);


    }
}
