package com.messiyang.leetcode.type.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 *  括号生成
 *  数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *  输入：n = 3
 *  输出：["((()))","(()())","(())()","()(())","()()()"]
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/4/30 4:54 下午
 */
public class generateParenthesis {
    public  List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans,new StringBuffer(),0,0,n);
        return ans;
    }
    public void backtrack(List<String> ans,StringBuffer cur,int open,int close,int max){
        if(cur.length()==max*2){
            ans.add(cur.toString());
            return;
        }
        if(open<max){
           cur.append("(");
           backtrack(ans,cur,open+1,close,max);
           cur.deleteCharAt(cur.length()-1);
        }

        if(close<open){
            cur.append(")");
            backtrack(ans,cur,open,close+1,max);
            cur.deleteCharAt(cur.length()-1);
        }
    }

}
