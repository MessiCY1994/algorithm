package com.messiyang.leetcode.mid;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/13 3:34 下午
 */
public class subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(res,list,nums,0);
        return res;
    }

    public static void dfs( List<List<Integer>> res,List<Integer> list,int[] nums,int index){
        res.add(new ArrayList<>(list));
        for(int num:nums){
            if(!list.contains(num)){
                list.add(num);
                dfs(res,list,nums,++index);
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }
}
