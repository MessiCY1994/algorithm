package com.messiyang.leetcode.mid;

/**
 * 旋转图像
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/8 5:57 下午
 */
public class rotate {
    public void rotate(int[][] matrix) {
        int[][] tmp = new int[matrix.length][matrix[0].length];
        int length = matrix.length;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                tmp[j][length-i-1] = matrix[i][j];
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = tmp[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int [][] arr=new int[][]{{4,5,6,8},{2,3},{1,6,9}};
        System.out.println(arr.length);//输出行数
        System.out.println(arr[0].length);//输出列数
    }
}
