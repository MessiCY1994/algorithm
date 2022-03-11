package com.messiyang.leetcode.mid;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *  合并区间

 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 输出：[[1,6],[8,10],[15,18]]
 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6]
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/9 9:47 下午
 */
public class merge {
    public static int[][] merge(int[][] intervals) {


        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res = new LinkedList<>();
        int[] temp = null;

        for(int[] interval:intervals){
            if(res.size()==0||interval[0]>temp[1]){
                temp = interval;
                res.add(temp);
            }else{
                temp[1] = Math.max(interval[1],temp[1]);
            }
        }
        return res.toArray(new int[0][]);

//        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//        System.out.println(Arrays.stream(intervals).toArray());
//        List<int []> res = new LinkedList<>();
//
//        int [] curInterval = null;
//        for(int[] interval : intervals){
//            if(res.size() == 0 || interval[0] > curInterval[1]){
//                curInterval = interval;
//                res.add(curInterval);
//            }else{
//                curInterval[1] = Math.max(curInterval[1], interval[1]);
//            }
//        }

    }
    public static void main(String[] args) {
        int [][] arr=new int[][]{{2,6},{1,3},{8,10},{15,18}};
        merge(arr);
    }
}
