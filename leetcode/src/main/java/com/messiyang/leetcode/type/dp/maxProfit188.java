package com.messiyang.leetcode.type.dp;

/**
 *  买卖股票的最佳时机 IV
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv/
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/4/10 3:45 下午
 */
public class maxProfit188 {
    public int maxProfit(int k, int[] prices) {
        int day = prices.length;

        if(k>day/2){
            k = day/2;
        }
        /**
         *  day
         *  交易次数
         *  status 0-没股票 1-有股票
         */
        int[][][] dp = new int[day+1][k+1][2];

        //初始化
        for(int i=0;i<k+1;i++){
            dp[0][i][0]=0;
            dp[0][i][1] = Integer.MIN_VALUE;
        }

        int maxRes = 0;
        for(int i=0;i<day+1;i++){
            for(int nk=1;nk<k+1;nk++){
                dp[i][nk][0] = Math.max(dp[i-1][nk][0],dp[i-1][nk][1]+prices[i-1]);
                dp[i][nk][1] = Math.max(dp[i-1][nk][1],dp[i-1][nk][0]-prices[i-1]);
                maxRes = Math.max(maxRes,dp[i][nk][0]);
            }
        }
        return maxRes;

    }
}
