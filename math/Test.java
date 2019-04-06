package com.matajie;

import java.util.Scanner;

/**
 *
 * 注意判断条件
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
/*public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qingshuru");
        int x = scanner.nextInt();
        if(is2demi(x)){
            System.out.println("shi");
        }else {
            System.out.println("bushi");
        }
    }
    public static boolean is2demi(int x){
       *//* if(x == 1){
            return true;
        }
        if (x<=0) {
            return false;
        }
        for(int i = 1; i<x;i*=2){
            if (x % i != 0){
                return false;
            }
            continue;
        }
        return true;*//*
        if(x == 1){
            return true;
        }
        if (x<=0) {
            return false;
        }
        for(int i = 1; i<x;i*=2){
            if (x % i != 0){
                return false;
            }
            continue;
        }
        return true;
    }
}*/


/*

public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int num =0;
        for(int i = 0;i<1000;i++){
            if(is2demi(i)){
                num = i;
            }
        }
        System.out.println(num);
    }
    public static boolean is2demi(int x){
        if(x <= 0){
            return false;
        }
        if(x == 1){
            return true;
        }
        for(int i =2;i<x;i*=2){
            if(x%i != 0){
                return false;
            }
        }
        return true;
    }
}
*/


/*
public class Test{
    public static void main(String[] args) {

        for(int i = 0;i<100;i++){
            if(is3demi(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean is3demi(int x) {
        if (x <= 0) {
            return false;
        } else if (x == 1) {
            return true;
        }
        for (int i = 1; i < x; i*= 3) {
            if (x % i != 0) {
                return false;
            }
        }
        return true;
    }
}
*/


/*public static int sum(int day) {
        if (day == 10) {
        return 1;
        }else {
        return (sum(day+1)+1) * 2;
        }
        }*/


/*public class Test{
    public static void main(String[] args) {
       for(int i = 1;i<100;i++){
            if(is3demi(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean is3demi(int x){
        if(x <= 0){
            return false;
        }
        if(x== 1){
            return true;
        }
        int count =0;
        for(int i = 1;i<x;i*=3){
          if(x%i !=0){
              return false;
          }
          if(i*3 == x){
              count++;
          }
        }
        if(count == 0){
              return false;
        }
        return true;*/
/*
   public static void main(String[] args) {
       for(int i = 1;i<100;i++){
           if(is3demi(i)){
               System.out.println(i);
           }
       }
   }
    public static boolean is3demi(int x) {
        if (x < 1) {
            return false;
        }
            while (x !=1) {
                if (x % 3 != 0) {
                    return false;
                }
                x /= 3;
            }
    return true;
    }
}
*/

/*
 if(n < 1) {
        return false;
        }
        while (n != 1) {
        if (n % 3 != 0) {
        return false;
        }
        n /= 3;
        }
        return true;
*/


/*

public class Test {
    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            if(is3demi(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean is3demi(int x) {
        if (x < 1) {
            return false;
        }
        while (x != 1) {
            if (x % 3 != 0) {
                return false;
            }
            x /= 3;
        }
        return true;
    }
}
*/















