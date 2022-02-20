package com.messiyang.leetcode.easy;

/**
 * 移动零
 *
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/2/20 3:49 下午
 */
public class moveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=index){
                    nums[index]=nums[i];
                    nums[i]=0;
                }
                index++;
            }
        }
    }
}
