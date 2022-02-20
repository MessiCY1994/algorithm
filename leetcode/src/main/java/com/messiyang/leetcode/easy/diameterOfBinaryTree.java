package com.messiyang.leetcode.easy;

import com.messiyang.leetcode.common.TreeNode;

/**
 * 二叉树的直径
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/2/20 3:55 下午
 */
public class diameterOfBinaryTree {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        setDepth(root);
        return max;
    }

    public int setDepth(TreeNode root){
        if(root!=null){
            int right = setDepth(root.right);
            int left = setDepth(root.left);
            if (right + left > max){
                max = right + left;
            }
            return Math.max(right, left) + 1;
        }
        return 0;
    }
}
