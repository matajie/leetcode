package com.leetcode.math;

/**
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 *
 * 942. 增减字符串匹配
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 *
 * 示例 1：
 * 输出："IDID"
 * 输出：[0,4,1,3,2]
 * 示例 2：
 * 输出："III"
 * 输出：[0,1,2,3]
 */
public class DiStringMatch {
    public int[] diStringMatch(String S) {
    int size = S.length();
    int[] ret = new int[size+1];
    int i = 0;int d = size;
    for(int j = 0;j<size;j++){
        if(S.charAt(j) == 'D'){
            ret[j] = d;
            d--;
        }else {
            ret[j] = i;
            i++;
        }
    }
    ret[size] = d;
    return ret;
    }

}











