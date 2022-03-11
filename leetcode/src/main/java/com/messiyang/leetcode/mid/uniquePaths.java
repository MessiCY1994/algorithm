package com.messiyang.leetcode.mid;

/**
 * 1. 确定dp数组下表含义 dp[i][j] 到每一个坐标可能的路径种类
 * 2. 递推公式 dp[i][j] = dp[i-1][j] dp[i][j-1]
 * 3. 初始化 dp[i][0]=1 dp[0][i]=1 初始化横竖就可
 * 4. 遍历顺序 一行一行遍历
 * 5. 推导结果 。。。。。。。。
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/11 3:23 下午
 */
public class uniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        //初始化
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        uniquePaths(3,4);
    }
}
