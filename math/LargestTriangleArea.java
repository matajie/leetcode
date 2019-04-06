package com.matajie;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

/**
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double area=0;
        for(int i = 0;i<points.length;i++){
            for(int j = 0;j<points.length;j++){
                for(int k = 0;k<points.length;k++){
                    area = Math.max(area,triangleArea(points[i],points[j],points[k]));
                }
            }
        }
        return area;
    }
    private double triangleArea(int[] A,int[] B,int[] C){
        return 0.5*Math.abs(A[0]*B[1]+B[0]*C[1]+C[0]*A[1]-A[1]*B[0]-B[1]*C[0]-C[1]*A[0]);
    }
}
