package com.messiyang.leetcode.easy;

/**
 * 最大子数组之和
 * @ClassName maxSubArray
 * @Description: TODO
 * @Author messi
 * @Date 2021/12/29
 * @Version V1.0
 **/
public class maxSubArray {
    public int maxSubArray(int[] nums) {
       int max = 0;
       int res = nums[0];
       for(int num:nums){
           if(max>0){
               max = max+num;
           }else{
               max = num;
           }
           res = Math.max(max,res);
       }
       return res;
    }
}
