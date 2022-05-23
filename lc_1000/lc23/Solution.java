package lc_1000.lc23;

import java.util.PriorityQueue;

/**
 * @author qingjiusanliangsan
 * create 2022-05-17-16:10
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode head = new ListNode();
        ListNode pre = head;
        for(ListNode node : lists){
            if(node !=null){
                pq.add(node);
            }
        }

        while (!pq.isEmpty()){
            ListNode node = pq.poll();
            pre.next = node;
            pre = node;
            if(node.next != null){
                pq.add(node.next);
            }
        }
        return head.next;
    }
}