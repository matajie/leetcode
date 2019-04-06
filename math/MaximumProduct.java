package com.matajie;

/**
 *  给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: 6
 * 示例 2:
 * 输入: [1,2,3,4]
 * 输出: 24
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
/*
public class MaximumProduct {
    public static int maximumProduct(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = tmp;
                }
            }
        }
        int tmp = arr.length;
        int r1 = arr[0]*arr[1]*arr[tmp-1];
        int r2 = arr[tmp-1]*arr[tmp-2]*arr[tmp-3];
        return r1>r2?r1:r2;
    }
}
*/
