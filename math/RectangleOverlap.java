package com.matajie;

/**
 * 矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，(x2, y2) 是右上角的坐标。
 * 如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。
 * 给出两个矩形，判断它们是否重叠并返回结果。
 * 示例 1：
 * 输入：rec1 = [0,0,2,2], rec2 = [1,1,3,3]
 * 输出：true
 *
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
public class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
       return !(rec1[0]>=rec2[2]||rec1[2]<=rec2[0]||rec1[1]>=rec2[3]||rec1[3]<=rec2[1]);
    }
}