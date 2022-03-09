package com.messiyang.leetcode.mid;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合总和
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/8 4:03 下午
 */
public class combinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(res,list,candidates,target,0);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> list,int[] candidates,int target,int start){
        if (target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=start;i<candidates.length;i++){
            int key = candidates[i];
            list.add(key);
            dfs(res,list,candidates,target-key,start);
            list.remove(list.size()-1);
        }
    }
}
