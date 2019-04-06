package com.matajie;

import java.util.Scanner;

/**
 * 编写一个算法来判断一个数是不是“快乐数”。
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * 示例:
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("shuru");
        int i = scanner.nextInt();
        if(isHappyNumber(i)){
            System.out.println("shi");
        }else {
            System.out.println("bushi");
        }
    }
    public static boolean isHappyNumber(int n){
        int sum = 0;
        while (n>0){
            sum += n%10 * n%10;
            n/= 10;
        }
        if(sum == 1){
            return true;
        }
        if(sum == 4|| sum == 16|| sum == 37|| sum == 30|| sum == 9|| sum == 81
                || sum == 65|| sum == 37 || sum == 58|| sum == 89){
            return false;
        }
        else return isHappyNumber(sum);
    }
}
