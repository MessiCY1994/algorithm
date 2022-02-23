package com.messiyang.leetcode.easy;

import com.messiyang.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序便利
 * @ClassName inorderTraversal
 * @Description: TODO
 * @Author messi
 * @Date 2021/12/29
 * @Version V1.0
 **/
public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }

    public void inorder(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}
