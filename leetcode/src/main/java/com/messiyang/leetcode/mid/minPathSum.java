package com.messiyang.leetcode.mid;

/**
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/13 2:55 下午
 */
public class minPathSum {
    public int minPathSum(int[][] grid) {
        int[][] temp = new int[grid.length][grid[0].length];
        for(int i=1;i<grid.length;i++){
            temp[i][0]+=temp[i-1][0];
        }
        for(int j=1;j<grid[0].length;j++){
            temp[0][j]+=temp[0][j-1];
        }

        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                temp[i][j]+=Math.min(temp[i][j-1],temp[i-1][j]);
            }
        }
        return temp[grid.length-1][grid[0].length-1];
    }
}
