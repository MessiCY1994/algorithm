package com.messiyang.leetcode.type.array;

import java.util.*;

/**
 * 前 K 个高频元素
 *  https://leetcode-cn.com/problems/top-k-frequent-elements/
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/28 11:43 下午
 */
public class topKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueues = new PriorityQueue<>((m1,m2)->m1.getValue()-m2.getValue());
        for(Map.Entry<Integer, Integer> entrie:entries){
            priorityQueues.offer(entrie);
            if(priorityQueues.size()>k){
                priorityQueues.poll();
            }
        }

        for(int i=k-1;i>=0;i--){
            result[i] = priorityQueues.poll().getKey();
        }
        return  result;













//       int[] result = new int[k];
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num,map.getOrDefault(num,0)+1);
//        }
//        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<>((m1,m2)->m1.getValue()-m2.getValue());
//        for(Map.Entry<Integer,Integer> entry:entries){
//            priorityQueue.offer(entry);
//            if(priorityQueue.size()>k){
//                priorityQueue.poll();
//            }
//        }
//        for(int i=k-1;i>=0;i--){
//            result[i] = priorityQueue.poll().getKey();
//        }
//        return result;
    }

    public static void main(String[] args) {
        int[] num = new int[]{2,1,2,1,1,3};
        topKFrequent(num,2);
    }
}
