package com.messiyang.leetcode.type.TreeNode;

import com.messiyang.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 层序遍历
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/4/9 3:54 下午
 */
public class levelOrder {
    public List<List<Integer>> levelOrderlevelOrderlevelOrder12(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        levelFind(root,res,0);
        return res;

    }


    /**
     * 层序遍历
     * @param root
     * @param res
     * @param level
     */
    public void levelFind(TreeNode root,List<List<Integer>> res,int level){
        List<Integer> nowLevelData;
        if(level==res.size()){
            nowLevelData = new ArrayList<>();
            res.add(nowLevelData);
        }else {
            nowLevelData = res.get(level);
        }
        if (root == null) {
            return;
        }
        nowLevelData.add(root.val);

        //判断左右子树
        if(root.left==null&&root.right==null){
            return;
        }
        if(root.left!=null){
            levelFind(root.left,res,level+1);
        }
        if(root.right!=null){
            levelFind(root.right,res,level+1);
        }
    }
}
