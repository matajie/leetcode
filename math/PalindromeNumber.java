package com.matajie;

import java.util.Scanner;

/**
 * 回文数：是一种数字。如：98789, 这个数字正读是98789,倒读也是98789
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */

//

//正读倒读一样，所以这个数字就是回文数



import java.util.Scanner;



/*
public class PalindromeNumber{



    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");

        int num = sc.nextInt();



        String str1 = num +"";

        // String str1 = Integer.toString(num);

        // String str1 = String.valueOf(num);



        StringBuilder str2 = new StringBuilder(str1);

        str2.reverse();

        int count = 0;



        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) != str2.charAt(i)) {

                System.out.println(str1 + "不是回文数");

                break;

            } else {

                count++;

            }

        }

        if (count == str1.length()) {

            System.out.println(str1 + "是回文数");

        }

    }
}
*/
/*

public class PalindromeNumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = sc.nextInt();
        String str1 = num + "";
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        int count = 0;
        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                System.out.println("不是回文数");
                break;
            }else {
                count++;
            }
        }
        if(count == str1.length()){
            System.out.println("是回文数");
        }
    }
}
*/


/*
public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = sc.nextInt();
        String str1 = num + "";
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        int count = 0;
        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                System.out.println("不是");
                break;
            }else {
                count++;
            }
        }
        if(count == str1.length()){
            System.out.println("是");
        }
    }
}
*/



/*
public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int x= sc.nextInt();
      if(isPalindromeNumber(x)){
            System.out.println("shi");
        }else {
          System.out.println("bushi");
      }
    }
    public  static boolean isPalindromeNumber(int x){
        if(x == 0){
            return true;
        }
        if(x<0){
            return false;
        }
        int r = 0;
        int tmp = x;
        while (tmp != 0){
            r *= 10;
            r += tmp%10;
            tmp /= 10;
        }
       return r == x;
}}
*/
/*
    public class PalindromeNumber{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个整数");
            int num = sc.nextInt();
            if(true){
                System.out.println("shi");
            }
            if(false){
                System.out.println("bushi");
            }
        }
        public boolean isPalindromeNumber(int x){
            if(x<0){
                return false;
            }
            if(x==0){
                return true;
            }
            int r = 0;
            int tmp= x;
            while(tmp!=0){
                r*=10;
                r+=tmp%10;
                tmp/=10;
            }
            return r == x;
        }
    }
*/

/*
public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int x = scanner.nextInt();
        if(palindromeNumber(x)){
            System.out.println("是");
        }
    }
    public static boolean palindromeNumber(int x){
        if(x == 0){
         return true;
        }
        if(x<0){
            return false;
        }
        int r = 0;
        int tmp = x;
        while (tmp != 0){
            r*=10;
            r+=tmp%10;
            tmp/=10;
        }
        return r == x;
    }
}
*/

/*public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qingshuru");
     for(int i = 1;i<1000;i++){
         if(isPalindromeNumber(i)){
             System.out.println(i);
         }
     }

    }
    public static boolean isPalindromeNumber(int x){
        if(x == 0){
            return true;
        }
        if(x<0){
            return false;
        }
        int r =0;
        int tmp = x;
        while (tmp != 0){
            r *= 10;
            r += tmp%10;
            tmp/=10;
        }
       return r==x;
    }

}*/






















