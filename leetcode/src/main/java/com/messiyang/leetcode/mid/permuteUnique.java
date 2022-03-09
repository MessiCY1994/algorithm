package com.messiyang.leetcode.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/4 4:19 下午
 */
public class permuteUnique {
    public  static boolean[] vis;
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        vis = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(res,list,nums,0);
        return res;
    }

    public static void dfs(List<List<Integer>> res,List<Integer> list,int[] nums,int idx){
        if(idx==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
                continue;
            }
            list.add(nums[i]);
            vis[i] = true;
            dfs(res, list, nums, idx+1);
            vis[i] = false;
            list.remove(idx);
        }
    }

    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1,2,3,1}).toString());
    }
}
