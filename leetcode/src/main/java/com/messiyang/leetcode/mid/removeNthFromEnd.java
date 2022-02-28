package com.messiyang.leetcode.mid;

import com.messiyang.leetcode.common.ListNode;

/**
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/2/27 2:52 下午
 */
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dump = new ListNode(0,head);
        int length = getLength(head);
        ListNode cur = dump;
        for(int i=1;i< length - n + 1;i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dump.next;
        return ans;
    }

    public int getLength(ListNode dump){
        int i=0;
        while (dump!=null){
            i++;
            dump = dump.next;
        }
        return i;
    }
}
