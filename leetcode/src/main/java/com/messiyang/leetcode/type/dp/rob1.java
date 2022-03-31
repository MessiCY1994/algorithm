package com.messiyang.leetcode.type.dp;

/**
 * 打家劫舍1
 * https://leetcode-cn.com/problems/house-robber/
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/31 5:27 下午
 */
public class rob1 {
    public int rob(int[] nums) {
      if(nums==null){
          return 0;
      }
      if(nums.length==1){
          return nums[0];
      }

      int res = Math.max(nums[0],nums[1]);
      int[] dp = new int[nums.length];
        /**
         * dp[i] 截止到目前这一家，我们能拿到最大的一家
         */
        for(int i=0;i<nums.length;i++){
            if(i==0){
                dp[i] = nums[0];
                continue;
            }
            if(i==1){
                dp[i] = Math.max(nums[0],nums[1]);
                continue;
            }
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
            res = Math.max(res,dp[i]);
        }
        return res;

    }
}
