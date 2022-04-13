package com.messiyang.leetcode.easy;

import com.messiyang.leetcode.common.TreeNode;

/**
 * 对称二叉树
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2021/12/30 7:17 下午
 */
public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return issame(root.left, root.right);
    }

    public boolean issame(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || right.val != left.val) {
            return false;
        }
        return issame(left.left, right.right) && issame(left.right, right.left);
    }

    public static void main(String[] args) {
        String devId ="awfq192fbb067cbf0730090471hl";
        String realDevId = devId.substring(6,devId.length());
        System.out.println(realDevId);
    }
}
