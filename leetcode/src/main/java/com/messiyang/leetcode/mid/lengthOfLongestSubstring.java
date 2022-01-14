package com.messiyang.leetcode.mid;

/**
 *
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/1/13 7:16 下午
 */
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        String res = "";
        int max = 0;
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            String num = String.valueOf(chars[i]);
            if(res.contains(num)){
                int fir = res.indexOf(num);
                res = res.substring(fir+1,res.length());
            }
            res =res+num;
            max = Math.max(max,res.length());
        }
        return max;
    }
}
