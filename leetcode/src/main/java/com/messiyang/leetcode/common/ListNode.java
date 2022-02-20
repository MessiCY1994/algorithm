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
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr can not be empty");
        }

        this.val = arr[0];   // this.val对应arr中索引为0的元素
        //遍历整个数组，在这个过程中，我们一个一个的将数组中的每一个元素创建成新的ListNode,接在前一个节点上
        ListNode cur = this;  //从节点ListNode(arr[0])开始
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;     //最后我们的这个this其实是：用for循环创建出来的链表相对应的头节点
        }
    }


}

