package com.matajie;

import java.util.Scanner;

/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
public class SquareSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<100;i++){
            if(judgeSquareSum(i)){
                System.out.println(i);
            }
        }
    }
    public  static boolean judgeSquareSum(int c) {
       if(c == 0){
           return true;
       }
       int high = (int) Math.sqrt(c);
       int low = 0;
       int res = 0;
     while (low<=high){
         res = high*high+low*low;
         if(res== c){
             return true;
         }else if(res >c){
             high-=1;
         }else {
             low+=1;
         }
     }
     return false;
    }
}














