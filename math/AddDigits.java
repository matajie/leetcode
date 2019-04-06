package com.matajie;

import java.util.Scanner;

/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 * 示例:
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
/*
public class AddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qingshuru");
        int x = scanner.nextInt();
        System.out.println(addDigits(x));
    }
public static int addDigits(int num){
   */
/* if(num == 0){
        return 0;
    }
    int sum = 0;

    while (num>0){
        sum += num%10;
        num/=10;
        if(sum >10){
            num =sum;
        }
    }

      return sum;*//*

   if(num == 0){
       return 0;
   }else if(num %9 == 0){
       return 9;
   }else return num%9;
}

}
*/
