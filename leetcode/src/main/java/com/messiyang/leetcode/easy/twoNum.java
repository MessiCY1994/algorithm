package com.messiyang.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数想加
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum

 * @ClassName twoNum
 * @Description: TODO
 * @Author messi
 * @Date 2021/12/27
 * @Version V1.0
 **/
public class twoNum {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<length;i++){
            int a = nums[i];
            if(map.containsKey(a)){
                return new int[] {i,map.get(a)};
            }
            int b = target-a;
            map.put(b,i);
        }
        return  null;
    }
}
