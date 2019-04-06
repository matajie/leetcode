package com.matajie;

import java.util.Map;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
//最大子序和
public class MaxSubArray {
    public int maxSubArray(int[] arr) {
     /*   int res = arr[0];
        int sum = 0;
        for (int num : arr) {
            if (sum > 0) {
                 sum+=num;
            }
            else {
                sum =num;
            }
        }
     return res = Math.max(sum,res);*/

    int res = arr[0];
    int sum =0;
    for(int num:arr) {
        if (sum > 0) {
            sum += num;
        } else {
            sum = num;
        }
    }
    return res =Math.max(sum,res);
    }
}



