package com.messiyang.leetcode.type.array;

import java.util.Stack;

/**
 *  颜色分类
 * https://leetcode-cn.com/problems/sort-colors/
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/4/6 10:17 上午
 */
public class sortColors {
    public void sortColors(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            while(!stack.isEmpty()&&num!=stack.peek()){

            }

        }
    }
}
