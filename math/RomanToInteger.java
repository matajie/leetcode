package com.matajie;

import javax.crypto.Mac;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 罗马数字转整数
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
/*public class RomanToInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        System.out.println(romanToInteger(sc.nextLine()));

    }
 public static int romanToInteger(String s){
     Map<Character,Integer> map = new HashMap<>();
     map.put('I',1);
     map.put('V',5);
     map.put('X',10);
     map.put('L',50);
     map.put('C',100);
     map.put('D',500);
     map.put('M',1000);
     int result = 0;
     for(int i =0;i<s.length();i++){
         if(i>0&&map.get(s.charAt(i))>map.get(s.charAt(i-1))){
             result += map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
         }else {
             result += map.get(s.charAt(i));
         }
     }
     return result;
 }

}*/

/* public static int romanToInteter(String s) {
     Map<Character, Integer> map = new HashMap<>();
     map.put('I', 1);
     map.put('V', 5);
     map.put('X', 10);
     map.put('L', 50);
     map.put('C', 100);
     map.put('D', 500);
     map.put('M', 1000);
     int result = 0;
     for (int i = 0; i < s.length(); i++) {
         if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
             result += map.get(s.charAt(i)) - 2*map.get(s.charAt(i - 1));
         } else {
             result += map.get(s.charAt(i));
         }
     }
         return result;
     }
 }*/



/*
public class RomanToInteger{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        System.out.println(romanToInteger(sc.nextLine()));
    }
    public static int romanToInteger(String s){
        Map<Character,Integer>map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;
        for(int i = 0;i<s.length();i++){
            if(i>0&&map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                result+= map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
            }else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
*/




/*
public class RomanToInteger{
    public static int romanToInteger(String s){
        Map<Character,Integer>map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;
        for(int i = 0;i<s.length();i++){
            if(i>0&&map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                result+= map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
            }else {
                result+= map.get(s.charAt(i));
            }
        }
        return result;
    }
}
*/

//I-1  V-5 X-10  X-50 C-100 M-500 D-1000

/*

public class RomanToInteger{
    public static int romanToInteger(String s) {
        Map<Character, Integer> map = new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       int result = 0;
       for(int i  = 0;i<s.length();i++){
           if(i>0&&map.get(s.charAt(i))>map.get(s.charAt(i-1))){
               result+=map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
           }else {
               result+=map.get(s.charAt(i));
           }
       }
       return result;
    }
}
*/

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qingshuru");
        System.out.println(romanToInteger(scanner.nextLine()));
    }
    public static int romanToInteger(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;
        for(int i = 0;i<s.length();i++)
        if(i>0&&map.get(s.charAt(i))>map.get(s.charAt(i-1))){
            result += map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
        }else {
        result += map.get(s.charAt(i));
    }
    return result;
}
}



















