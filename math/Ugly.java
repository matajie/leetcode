package com.matajie;

/**
 * 编写一个程序判断给定的数是否为丑数。
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 * 示例 1:
 * 输入: 6
 * 输出: true
 * 解释: 6 = 2 × 3
 * 示例 2:
 * 输入: 8
 * 输出: true
 * 解释: 8 = 2 × 2 × 2
 * 示例 3:
 * 输入: 14
 * 输出: false
 * 解释: 14 不是丑数，因为它包含了另外一个质因数 7。
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
/*
public class Ugly {
    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            if (isUgly(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isUgly(int x){
     */
/*   if(x <1){
            return false;
        }
        if(x==2||x==3||x==5){
            return true;
        }
        int count =0;
      for(int i = 2;i<x;i++){
            if(x%i == 0){
                count++;
                if(i!=2&i!=3&i!=5){
                    count--;
                    return isUgly(i);

                }
            }
            }
            if(count == 0){
                return false;
      }
      return true;*//*

  */
/*    if(x<1){
          return false;
      }
      while (x%2 == 0){
          x/=2;
      }
     while (x%3 == 0){
          x/=3;
     }
     while (x%5 == 0){
           x/=5;
     }
     return x == 1;*//*

    if(x<0){
        return false;
    }
    while (x%5 == 0){
         x/=5;
    }
    while (x%2 == 0){
        x/=2;
    }
    while (x%3 == 0){
        x/=3;
    }
    return x==1;
    }
}

*/









