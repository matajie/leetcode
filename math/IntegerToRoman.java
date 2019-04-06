package com.matajie;

/**
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 *//*1234

public class IntegerToRoman{
    public static void main(String[] args) {

    }
    public String intergerToRoman(int x){
        String[] M = new String[]{"","M","MM","MMM"};
        String[] C = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] X = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] I = new String[]{"","I","II","III","IV","V","VI","VII","VII","VIII","IX"};
        //return M[x/1000]+C[x/100%10]+X[x%100/10]+I[x%1000%100%10];
     return M[x/1000]+C[x%1000/100]+X[x%100/10]+I[x%10];
    }
}
*/


//1234
/*
public class IntegerToRoman{
    public static String intergerToRoman(int x){

        String[] M = new String[]{"","M","MM","MMM"};
        String[] C = new String[]{"","","","","","","",""};
        String[] X = new String[]{"","","","","","","",""};
        String[] I = new String[]{"","","","","","","",""};
        return M[x/1000] + C[x%1000/100] + X[x%100/10] +I[x%10];
    }
}
*/

























