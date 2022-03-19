package com.study.leetcode;

/**
 * @program: LeetCode
 * @description: 字符串反转
 * @author: yangyb
 * @create: 2022-01-24 22:45
 **/
public class StringReverse {
    public static void main(String[] args) {
        System.out.println("123456789");
        System.out.println(reverse("123456789"));
        System.out.println(reverseCharAt("123456789"));
    }


    private static String reverse(String str) {
        //将字符串转换为字符数组
        char[] charArray = str.toCharArray();
        //创建一个字符串对象
        //StringBuffer buffer = new StringBuffer();
        String result = "";
        //遍历字符数组（倒序往前遍历:charArray.length-1 最后一个元素）
        for (int i = charArray.length - 1; i >= 0; i--) {
            //字符拼接
            //buffer.append(charArray[i]);
            result += charArray[i];
        }
        //return  buffer.toString();
        return result;
    }

    /**
     * @Description: 方法二：利用String的ChatAt()
     * @Param:
     * @return:
     */
    private static String reverseCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

}
