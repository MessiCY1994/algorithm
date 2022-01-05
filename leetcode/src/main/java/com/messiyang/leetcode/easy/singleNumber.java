package com.messiyang.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 只出现一次的数字
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/1/6 12:00 上午
 */
public class singleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> cache = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!cache.add((nums[i]))) {
                cache.remove(nums[i]);
            }
        }
        return cache.iterator().next();
    }
}
