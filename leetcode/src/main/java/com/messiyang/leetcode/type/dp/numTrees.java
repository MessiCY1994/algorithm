package com.messiyang.leetcode.type.dp;

/**
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/4/11 11:32 下午
 */
public class numTrees {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            for(int j=1;j<=i;j++){
                dp[i] +=dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
