package com.messiyang.leetcode.type.ListNode;

import com.messiyang.leetcode.common.ListNode;

/**
 * . 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/4/30 4:40 下午
 */
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dump = new ListNode(0,head);
        int length = getLength(head);
        ListNode curr= dump;
        for(int i=0;i<length-n;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return dump.next;
    }

    public int getLength(ListNode head){
        int i=0;
        while (head!=null){
            i++;
            head = head.next;
        }
        return i;
    }
}
