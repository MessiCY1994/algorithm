package com.messiyang.leetcode.easy;

import com.messiyang.leetcode.common.ListNode;

/**
 * 合并两个有序链表
 * @ClassName mergeTwoLists
 * @Description: TODO
 * @Author messi
 * @Date 2021/12/29
 * @Version V1.0
 **/
public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode temp = list1.val<list2.val?list1:list2;
        temp.next = mergeTwoLists(temp.next,list1.val>=list2.val?list1:list2);
        return temp;
    }
}
