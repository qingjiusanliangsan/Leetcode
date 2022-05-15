package lc_1000.lc206;

/**
 * @author qingjiusanliangsan
 * create 2022-05-04-19:40
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode pre = head;
        ListNode tail = head.next;
        head.next = null;
        ListNode tem;
        while(tail != null){
            tem = tail.next;
            tail.next = pre;
            pre = tail;
            tail = tem;
        }
        return pre;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}