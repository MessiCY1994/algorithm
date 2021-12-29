package com.messiyang.leetcode.easy;

import com.messiyang.leetcode.common.TreeNode;

/**
 * @ClassName maxDepth
 * @Description: TODO
 * @Author messi
 * @Date 2021/12/29
 * @Version V1.0
 **/
public class maxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
