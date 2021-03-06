package com.messiyang.leetcode.mid;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/4 1:54 下午
 */
public class generateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public static void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
        if(cur.length()==max*2){
            ans.add(cur.toString());
        }

        if(open<max){
            cur.append("(");
            backtrack(ans,cur,open+1,close,max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(')');
            backtrack(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3).toString());
    }
}
