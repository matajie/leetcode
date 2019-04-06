package com.matajie;

import java.util.Scanner;

/**
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 示例 1:
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
/*
public class MySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入x");
        int x = scanner.nextInt();
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }
        if (x < 0) {
            return -1;
        }
        int count = 0;
        for (int i = 1; i <x; i++) {

                if (i * i == x) {   //x=100
                    count++;
                    return i;
                }
            }
            if(count ==  0)            //5
                for (int j = x - 1; j < x; j--) {
                    for (int k = 1; k <=j/2; k++) {
                        if (k * k == j) {
                            return k;
                        }
                    }
                }
        return x;
    }
}
*/


/*public class MySort{

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入x");
        int x = scanner.nextInt();
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x)
    {
        if (x == 0)
            return 0;

        if (x < 0)
            return -1;

        for(int i = 1; i <= x; i++)
        {
            if(i * i == x)
            {
                return i;
            }
        }

        return mySqrt(x - 1);*/
      /*   public static int mySort(int num){

       for(int i = 0;i<=x;i++){
            if(i*i == x){
                return i;
            }
           else if(i*i<x&&(i+1)*(i+1)>x){
                return i;
            }
        }
        return x;

    }
}*/

/*
public class MySort{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qinghsuru");
       int x = scanner.nextInt();

        System.out.println(mySort(x));
    }
    public static int mySort(int x) throws InterruptedException {
       if(x == 1||x == 0){
           return x;
       }

       double low = 0;
       double high= x;
       double mid = 0;
        while ((int)low<(int)high){
            mid = (low+high)/2;
            if(mid*mid == x){
                return (int) mid;
            }else if(mid * mid>x){
                high = mid;
            }else {
                low = mid;
            }
        }
        return (int) mid;
    }

}
*/





