package com.messiyang.leetcode.type.TreeNode;

import com.messiyang.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树展开为链表
 * https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/4/13 6:23 下午
 * 前序：加压左弹右
 *
 */
public class flatten {
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null||!stack.isEmpty()){
            while (root!=null){
                list.add(root);
                stack.push(root);
                root = root.left;
            }
            TreeNode cur = stack.pop();
            root=cur.right;
        }


        for(int i=1;i<list.size();i++){
            TreeNode treeNode = list.get(i-1);
            TreeNode curr = list.get(i);
            treeNode.left = null;
            treeNode.right= curr;
        }

    }
}
