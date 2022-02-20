package com.messiyang.leetcode.easy;

import com.messiyang.leetcode.common.ListNode;

/**
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/2/20 4:19 下午
 */
public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return this.addTwoNumbers2(l1,l2,0);
    }
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2,int a) {
        if(l1==null&&l2==null){
            return a==0?null:new ListNode(a);
        }
        if(l1!=null){
            a = a+l1.val;
            l1 = l1.next;
        }
        if(l2!=null){
            a = a+l2.val;
            l2 = l2.next;
        }
        return new ListNode(a%10,addTwoNumbers2(l1,l2,a/10));

    }
}
