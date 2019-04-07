package com.leetcode.math;

/**
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
            if(nums.length<=1){//当数组长度小于等于1时,返回空数组
                return new int[0];
            }
            int n = nums.length;
            int[] array = new int[n+1];//创建一个哈希表
            int[] ret = new int[2];//创建一个存放重复元素和缺失元素的数组;
            for(int i =0;i<n+1;i++){
                array[i] = 0;//将所有元素初始化为0
            }
            for(int i = 0;i<n;i++){
                if(array[nums[i]] == 1){
                    ret[0] = nums[i];//找到重复出现的数
                }
                array[nums[i]] = 1;//让所有出现过的,不管是否重复出现,将其元素置为1;
            }
            for(int i = 1;i<n+1;i++){
                if(array[i] == 0){
                    ret[1] = i;
                    return ret;
                }
            }
            return new int[0];
    }
}

