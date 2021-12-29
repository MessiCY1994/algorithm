package com.messiyang.leetcode.easy;

/**
 * 爬楼梯
 * @ClassName climbStairs
 * @Description: TODO
 * @Author messi
 * @Date 2021/12/29
 * @Version V1.0
 **/
public class climbStairs {
    public int climbStairs(int n) {
        // 1 1
        //2 1+1 2
        //3 1+1+1 1+2 3
        //4 1+1+1+1 1+2+1 1+3 4 2+2
        //5 1+1+1+1+1 1+2+1+1 1+2+2 1+3+1 1+4 5 3+2
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
