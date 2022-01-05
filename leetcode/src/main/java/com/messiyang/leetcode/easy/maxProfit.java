package com.messiyang.leetcode.easy;

/**
 * 买卖股票最佳时机
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/1/5 11:31 下午
 */
public class maxProfit {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int size = prices.length;
        int num = prices[0];
        for (int i = 1; i < size; i++) {
            int now = prices[i];
            if (num < now) {
                int sub = now - num;
                max = Math.max(max, sub);
            } else {
                num = now;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] y = new int[] {1, 2};
        System.out.println(maxProfit(y));
    }
}
