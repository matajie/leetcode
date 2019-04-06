package com.matajie;

import java.util.Scanner;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 *
 * 注意 j = i+1
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
/*
public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");

        System.out.println(TwoSum(scanner.nextLine()));

    }
    public static int[] TwoSum(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
     throw new IllegalArgumentException("No two");
    }
}
*/


    /* for(int i = 0;i<arr.length;i++){
         for(int j = i+1;j<arr.length;j++){
             if(arr[i]+arr[j]==target) {
                 return new int[]{i, j};
             }
         }
     }
     throw new IllegalArgumentException("cont find");*/


/*
public class TwoSum{
    public static int[] TwoSum(int[] arr,int target){
          for(int i = 0;i<arr.length;i++){
              for(int j = i+1;j<arr.length;j++){
                  for(int k = j+1;k<arr.length;k++){
                      if(arr[i]+arr[j]+arr[k] == target){
                          return new int[]{i,j,k};
                      }
                  }
              }
          }
          throw new IllegalArgumentException("cant find");
    }
}
*/

/*
public class TwoSum{
public int[] TwoSum(int[] arr,int target){
    for(int i = 0;i<arr.length;i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) {
                return new int[]{i, j};
            }
        }
    }
    throw new IllegalArgumentException();
}
}
*/

/*
public class TwoSum{
    public  int[] twoSum(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
*/


















