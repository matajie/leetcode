package com.matajie;

/**
 * 对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
 * 给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False
 *
 * 示例：
 * 输入: 28
 * 输出: True
 * 解释: 28 = 1 + 2 + 4 + 7 + 14
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
public class PerfectSquare {
    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            if(isPerfectSquare(i)){
            System.out.println(i);
        }
        }
    }
    public static boolean isPerfectSquare(int x) {
       /* if(x <= 0){
            return false;
        }
        if(x == 1){
            return true;
        }
          for(int i = 0;i<x;i++){
            if(i*i == x){
                return true;
            }
          }
          return false;*/
      if(x == 0){
          return false;
      }
      int sumx=1;
      while (x>0){
          x -= sumx;
          sumx+=2;
      }
      return x == 0;
    }
}
