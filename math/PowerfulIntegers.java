package com.matajie;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 970. 强整数
 * 给定两个正整数 x 和 y，如果某一整数等于 x^i + y^j，其中整数 i >= 0 且 j >= 0，那么我们认为该整数是一个强整数。
 * 返回值小于或等于 bound 的所有强整数组成的列表。
 * 你可以按任何顺序返回答案。在你的回答中，每个值最多出现一次。
 *
 * 示例 1：
 * 输入：x = 2, y = 3, bound = 10
 * 输出：[2,3,4,5,7,9,10]
 * 解释：
 * 2 = 2^0 + 3^0
 * 3 = 2^1 + 3^0
 * 4 = 2^0 + 3^1
 * 5 = 2^1 + 3^1
 * 7 = 2^2 + 3^1
 * 9 = 2^3 + 3^0
 * 10 = 2^0 + 3^2
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
public class PowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
      Set<Integer> seen = new HashSet<>();
      for(int i = 0;i<20&&Math.pow(x,i)<=bound;i++){
          for(int j = 0;j<20&&Math.pow(y,j)<=bound;j++){
              int v = (int) (Math.pow(x,i)+Math.pow(y,j));
            if(v <= bound){
                seen.add()
            }
          }
      }
      return new ArrayList(seen);
    }
}