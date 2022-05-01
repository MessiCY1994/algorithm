package com.messiyang.leetcode.type.string;

/**
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/4/28 11:33 下午
 */
public class lengthOfLongestSubstringTwoTimes {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        String res = "";
        int max = 0;
        for(int i=0;i<chars.length;i++){
            char aChar = chars[i];
            String key = String.valueOf(aChar);
            if(res.contains(key)){
                int first = res.indexOf(key);
                res = res.substring(first+1,res.length());
            }
            res = res+key;
            max = Math.max(res.length(),max);
        }
        return max;
    }
}
