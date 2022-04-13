package com.messiyang.leetcode.type.TreeNode;

import com.messiyang.leetcode.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 从前序与中序遍历序列构造二叉树
 * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/4/1 2:22 下午
 */
public class buildTree {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        int inorderIndex = 0;
        for (int i = 1; i < preorder.length; i++) {
            int preorderVal = preorder[i];
            TreeNode node = deque.peek();
            if (node.val != inorder[inorderIndex]) {
                node.left = new TreeNode(preorderVal);
                deque.push(node.left);
            } else {
                while (!deque.isEmpty() && deque.peek().val == inorder[inorderIndex]) {
                    node = deque.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(preorderVal);
                deque.push(node.right);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.push("A"); // A
        deque.push("B"); // A <- B
        deque.push("C"); // C <- A <- B
        System.out.println(deque.peek());
        System.out.println(deque.pop());
    }
}
