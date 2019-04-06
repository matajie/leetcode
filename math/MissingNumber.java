package com.matajie;

import java.util.Arrays;

/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * 示例 1:
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
public class MissingNumber {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        for( i = 0;i<arr.length;i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return i;
}
}
/*
    int res = arr.length;
        for (int i = 0; i < arr.length; i++) {
        res = res ^ i ^ arr[i];
        }
        return res;
*/