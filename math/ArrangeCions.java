package com.matajie;

/**
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 * n 是一个非负整数，并且在32位有符号整型的范围内。
 * 示例 1:
 * n = 5
 *
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤
 *
 * 因为第三行不完整，所以返回2.
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
/*
public class ArrangeCions {
    public static int arrangeCoins(int n){
 int t = n;
 if(n == 1){
     return 1;
 }
 for(int i =0;i<=t;i++){
     n-=i;
     if(n<0){
         return i-1;
     }
 }
 return 0;
}
}
*/
