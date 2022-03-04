package com.messiyang.leetcode.mid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/2 2:00 下午
 */
public class permute {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Collections.swap(list, 0, 2);
        System.out.println(list);
    }

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            backtrack(res, list, nums);
            return res;
        }

        public void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums) {
            if(list.size() == nums.length) {
                res.add(new ArrayList<Integer>(list));
                return;
            }
            for(int num : nums) {
                if(!list.contains(num)) {
                    list.add(num);
                    backtrack(res, list, nums);
                    list.remove(list.size() - 1);
                }
            }
        }
}
