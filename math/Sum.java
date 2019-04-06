package com.matajie;

import java.util.Scanner;

/**
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
//100的叠加
/*
public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
    public static int sum(int num){
        if(num == 1){
            return 1;
        }else  {
            return num+sum(num-1);
        }
    }
}
*/

/*
public class Sum{
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
    public static int sum(int num){
        if(num == 1){
            return 1;
        }else {
            return num+sum(num-1);
        }
    }
}
*/

/*

public class Sum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qingshuru");
        System.out.println(sum(scanner.nextInt()));
    }
    //row行
    public static int sum(int row){
        int n = 0;
        if(n == 0){
            row = 0;
        }
        if(n == 1){
            row = 1;
        }
    else if((row + sum(row-1))<=n){
        return row;
    }
    return row;
    }
}

*/







