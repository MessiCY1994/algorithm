package com.messiyang.leetcode.easy;

import com.messiyang.leetcode.common.ListNode;

/**
 * 相交链表
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/1/6 10:01 下午
 */
public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode last = headB;
        while (last.next != null) {
            last = last.next;
        }
        last.next = headB;

        ListNode fast = headA;
        ListNode slow = headA;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = headA;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                last.next = null;
                return fast;
            }
        }
        last.next = null;
        return null;
    }
}
