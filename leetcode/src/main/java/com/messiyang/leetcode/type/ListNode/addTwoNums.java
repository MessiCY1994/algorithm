package com.messiyang.leetcode.type.ListNode;

import com.messiyang.leetcode.common.ListNode;

import java.util.List;

/**
 * 两数相加
 * https://leetcode-cn.com/problems/add-two-numbers/
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/28 11:23 下午
 */
public class addTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return this.addNums(l1,l2,0);
    }

    public ListNode addNums(ListNode l1,ListNode l2,int a){
        if(l1==null&&l2==null){
            return a==0?null:new ListNode(a);
        }
        if(l1!=null){
            a=a+l1.val;
            l1=l1.next;
        }
        if(l2!=null){
            a=a+l2.val;
            l2=l2.next;
        }
        return new ListNode(a%10,addNums(l1,l2,a/10));
    }
}
