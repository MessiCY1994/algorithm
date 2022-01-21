package com.messiyang.leetcode.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/1/20 7:22 下午
 */
public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length <= 2) {
            return ans;
        }
        //排序
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            //如果第一个数字大于0，后面的数都比它大，肯定不成立了
            if (nums[i] > 0){
                break;
            }
            //去掉重复情况
            if(i>0 && nums[i] == nums[i - 1]){
                continue;
            }

            int target = -nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left<right){
                if (nums[left] + nums[right] == target) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                left++;
                right--;
                while (left<right&&nums[left]==nums[left-1]){
                    left++;
                }
                while (left<right&&nums[right]==nums[right+1]){
                    right--;
                }
                }else if(nums[left] + nums[right] < target){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return ans;
    }
}
