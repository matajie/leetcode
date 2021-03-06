package com.matajie;

/**
 * 给定一个正整数 N，找到并返回 N 的二进制表示中两个连续的 1 之间的最长距离。
 * 如果没有两个连续的 1，返回 0 。
 *
 *
 * 示例 1：
 * 输入：22
 * 输出：2
 * 解释：
 * 22 的二进制是 0b10110 。
 * 在 22 的二进制表示中，有三个 1，组成两对连续的 1 。
 * 第一对连续的 1 中，两个 1 之间的距离为 2 。
 * 第二对连续的 1 中，两个 1 之间的距离为 1 。
 * 答案取两个距离之中最大的，也就是 2 。
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
public class BinaryGap {
    public int binaryGap(int N) {
        int res = 0;
        int tmp = 0;
      String str = Integer.toBinaryString(N);
      for(int i = 0;i<str.length();i++){
          if(str.charAt(i) == 1){
              res = Math.max(res,i-tmp);
              tmp = i;
          }
      }
      return res;
    }
}
