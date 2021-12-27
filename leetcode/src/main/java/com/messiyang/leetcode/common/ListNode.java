package com.messiyang.leetcode.common;

import lombok.Data;

/**
 * @ClassName ListNode
 * @Description: TODO
 * @Author messi
 * @Date 2021/12/28
 * @Version V1.0
 **/
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode next() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}

