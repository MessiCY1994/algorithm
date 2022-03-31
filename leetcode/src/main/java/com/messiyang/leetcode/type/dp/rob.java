package com.messiyang.leetcode.type.dp;

import com.messiyang.leetcode.common.TreeNode;

/**
 * 打家劫舍 III
 *  https://leetcode-cn.com/problems/house-robber-iii/
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/29 7:51 下午
 */
public class rob {
    /**
     * res 二维数组 res0 res1
     * res0 不抢劫当前节点的最大值
     * res1 抢劫当前节点的最大值
     * @param root
     * @return
     */
    public int rob(TreeNode root) {
          int[] res = dp(root);
          return Math.max(res[0],res[1]);
    }

    public int[] dp(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int[] left = dp(root.left);
        int[] right = dp(root.right);

        int rob = root.val+left[0]+right[0];
        int not_rob = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return new int[]{not_rob,rob};

    }

}
