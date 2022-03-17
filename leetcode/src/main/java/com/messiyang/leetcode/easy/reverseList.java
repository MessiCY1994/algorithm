package com.messiyang.leetcode.easy;


import com.messiyang.leetcode.common.ListNode;

/**
 * 反转链表
 * @ClassName reverseList
 * @Description: TODO
 * @Author messi
 * @Date 2021/12/28
 * @Version V1.0
 **/
public class reverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return  null;
        }

        ListNode l1 = head;
        ListNode l2 =null;
        while (l1!=null){
            ListNode temp = l1.next;
            l1.next =l2;
            l2 = l1;
            l1 =temp;
        }
        return l2;

    }
}
