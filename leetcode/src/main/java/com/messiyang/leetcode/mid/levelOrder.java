package com.messiyang.leetcode.mid;

import com.messiyang.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的层级便利
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/17 6:18 下午
 */
public class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        levelFind(root, 0, result);
        return result;

    }

    public void levelFind(TreeNode node,int level, List<List<Integer>> result) {

        List<Integer> nowLevelData;
        if(level==result.size()){
            nowLevelData = new ArrayList<>();
            result.add(nowLevelData);
        }else {
            nowLevelData = result.get(level);
        }
        if (node == null) {
            return;
        }
        nowLevelData.add(node.val);
        if(node.left==null&&node.right==null){
            return;
        }

        if (node.left != null) {
            levelFind(node.left, level + 1, result);
        }
        if (node.right != null) {
            levelFind(node.right, level + 1, result);
        }
    }
}
