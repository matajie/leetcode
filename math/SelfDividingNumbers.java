package com.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 *
 *自除数 是指可以被它包含的每一位数除尽的数。
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * 还有，自除数不允许包含 0 。
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 * 示例 1：
 * 输入：
 * 上边界left = 1, 下边界right = 22
 * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
   /*  List<Integer> list = new ArrayList<>();
     int tmp = 0;
     int res = 0;
     boolean isselfDividingNumbers = true;
     for(int i = left;i<=right;i++){
         tmp = i;
         isselfDividingNumbers = true;
         while (tmp!=0){
             res = tmp%10;
             if(res == 0|| i%res!=0){
                 isselfDividingNumbers = false;
                 break;
             }
             tmp/=10;
         }
         if (isselfDividingNumbers){
             list.add(i);
         }
     }
  return list;*/
 List<Integer> list = new ArrayList<>();
 int t = 0;
 int res = 0;
 boolean isself = true;
 for(int i = left;i<=right;i++){
     t = i;
     while( t!= 0){
         res = t%10;
         if(res == 0|| i%res!=0){
             isself = false;
             break;
         }
         t/=10;
     }
     if(isself){
         list.add(i);
     }
 }
 return list;
    }
}
