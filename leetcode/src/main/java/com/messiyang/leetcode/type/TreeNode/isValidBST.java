package com.messiyang.leetcode.type.TreeNode;

import com.messiyang.leetcode.common.TreeNode;


import java.util.Stack;

/**
 * 验证二叉搜索树（中序遍历）
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 * 前序：加压左弹右
 * 后序：加压右弹左
 * 中序：压左弹加右
 */
public class isValidBST {
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        Stack<TreeNode> stack = new Stack();
        long lastvalue = Long.MIN_VALUE;
        while(root!=null||!stack.isEmpty()){
            while (root!=null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.val<=lastvalue){
                return false;
            }
            lastvalue = root.val;
            root = root.right;
        }
        return true;
    }
}
