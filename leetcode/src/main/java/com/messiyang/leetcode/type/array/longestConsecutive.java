package com.messiyang.leetcode.type.array;

import org.springframework.scheduling.concurrent.ScheduledExecutorTask;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 最长连续序列
 * https://leetcode-cn.com/problems/longest-consecutive-sequence/
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/4/15 4:56 下午
 */
public class longestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            hashSet.add(i);
        }
        int max =0;

        for (int i : hashSet) {
            int cur = 0;
            if (!hashSet.contains(i - 1)) {
                while (hashSet.contains(i)){
                    cur++;
                    i++;
                }
                max= Math.max(cur,max);
            }
        }
        return max;
    }
}
