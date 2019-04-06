package com.matajie;

import java.util.Scanner;

/**
 * 统计所有小于非负整数 n 的质数的数量。
 * 示例:
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 *
 * 厄拉多筛选法
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
/*
public class CountPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qinghsuru");
        int x = scanner.nextInt();
        countPrimes(x);
    }
    public  static int countPrimes(int n) {
              */
/*  boolean[] isPrime = new boolean[n];
                int result = 0;

                for (int i = 2; i < n; i++) {
                    isPrime[i] = true; //先初始化为true
                }

                for (int i = 2; i * i < n; i++) { //这一次for循环找出所有不是素数的数（也就是说被筛掉了）
                    if (!isPrime[i]) {
                        //既然已经被筛掉了就不用管了
                        continue;
                    } else {
                        for (int j = i * i; j < n; j += i) {
                            //由于i现在是一个素数, 那么i的平方一定不是素数，i^2 + i; i^2 + 2i也一定不是素数
                            isPrime[j] = false;
                        }
                    }
                } //所有不是素数的数已经全部筛掉

                //计算剩余的素数个数
                for (int i = 2; i < n; i++) {
                    if (isPrime[i] == true) {
                        result++;
                    }
                }
                return result;*//*



              boolean[] isPrime = new boolean[n];
        for(int i =2;i<n;i++){
            isPrime[i] = true;
        }
        int count = 0;
        for(int i = 2;i*i<n;i++){
            if(!isPrime[i]){
                continue;
            }else {
                for(int j = i*i;j<n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2;i<n;i++){
            if(isPrime[i]){
                System.out.println(i);

            }
        }
        return count;

     */
/*
        boolean[] isPrime = new boolean[n];
        for(int i = 2;i<n;i++){
            isPrime[i] = true;
        }
        int num = 0;
        for(int i = 0;i*i<n;i++){
            if(!isPrime[i]){
                continue;
            }else {
                for(int j = i*i;j<n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 0;i<n;i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }
        return n;*//*

    }

        }
*/


public class CountPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int x = scanner.nextInt();
        System.out.println(countPrime(x));
    }
    public static int countPrime(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i< n; i++) {
            isPrime[i] = true;
        }
        for(int i = 2;i*i<n;i++){
            if (!isPrime[i]) {
                continue;
            } else {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
               if(isPrime[i] == true){
                   count++;
               }
        }
        return count;
    }
}











