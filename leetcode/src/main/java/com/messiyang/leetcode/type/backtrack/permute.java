package com.messiyang.leetcode.type.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 *
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/5/1 5:17 下午
 */
public class permute {
    public  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backTrack(res,list,nums);
        return res;
    }

    public void backTrack(List<List<Integer>> res,List<Integer> list,int[] nums){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int num:nums){
            if(!list.contains(num)){
                list.add(num);
                backTrack(res,list,nums);
                list.remove(list.size()-1);
            }
        }
    }
}
