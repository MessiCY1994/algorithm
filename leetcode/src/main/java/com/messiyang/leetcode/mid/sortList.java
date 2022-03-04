package com.messiyang.leetcode.mid;

import com.messiyang.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 排序链表
 *
 * result = []
 * def backtrack(路径, 选择列表):
 *     if 满足结束条件:
 *         result.add(路径)
 *         return
 *
 *     for 选择 in 选择列表:
 *         做选择
 *         backtrack(路径, 选择列表)
 *         撤销选择
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/3 5:17 下午
 */
public class sortList {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list =new ArrayList<>();
        dfs(res,list,nums);
        return res;
    }

    public static void dfs(List<List<Integer>> res,List<Integer> list ,int[] nums){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int num:nums){
            if(!list.contains(num)){
                list.add(num);
                dfs(res,list,nums);
                list.remove(list.size()-1);
            }
        }
    }


    public static void main(String[] args) {
        List<List<Integer>> permute = permute(new int[]{1, 2, 3, 4});
        for(int i=0;i<permute.size();i++){
            List<Integer> integers = permute.get(i);
            System.out.println(integers.toString());
        }
    }
}
