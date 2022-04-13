package com.messiyang.leetcode.common;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName TreeNode
 * @Description: TODO
 * @Author messi
 * @Date 2021/12/29
 * @Version V1.0
 **/
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode fromArray(Integer[] tree) {
        if (tree.length == 0) return null;
        TreeNode root = new TreeNode(tree[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        for (int i = 1; i < tree.length; i++) {
            TreeNode node = q.peek();
            if (node.left == null) {
                node.left = new TreeNode(tree[i]);
                if (tree[i] != null) q.add(node.left);
            } else if (node.right == null) {
                node.right = new TreeNode(tree[i]);
                if (tree[i] != null) q.add(node.right);
                q.remove();
            }
        }
        return root;
    }
}
