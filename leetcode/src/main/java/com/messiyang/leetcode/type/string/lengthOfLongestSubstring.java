package com.messiyang.leetcode.type.string;

/**
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/4/1 8:47 下午
 */
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        String res = "";
        int max = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String num = String.valueOf(chars[i]);
            if (res.contains(num)) {
                int index = res.indexOf(num);
                res = res.substring(index + 1, res.length());
            }
            res = res + num;
            max = Math.max(max,res.length());
        }
        return res.length();
    }
}
