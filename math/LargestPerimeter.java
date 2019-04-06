package com.matajie;

import java.util.Arrays;

/**
 * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 * 如果不能形成任何面积不为零的三角形，返回 0。
 *
 *
 * 示例 1：
 * 输入：[2,1,2]
 * 输出：5
 * 示例 2：
 * 输入：[1,2,1]
 * 输出：0
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
public class LargestPerimeter {
    public int largestPerimeter(int[] A) {
        if(A.length<3){
            return 0;
        }
        Arrays.sort(A);
        int tmp = A.length;
        int res = 0;
        for (int i = tmp - 1; i > 2; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                return res = A[i] + A[i-1] + A[i-2];
            }
        }
        return res;
    }
}