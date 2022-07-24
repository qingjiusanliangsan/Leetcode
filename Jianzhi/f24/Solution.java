package Jianzhi.f24;

/**
 * @author qingjiusanliangsan
 * create 2022-07-21-17:43
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode pre = new ListNode(0);
        ListNode tem;
        pre.next = head;
        head = head.next;
        pre.next.next = null;

        while (head != null){
            tem = head;
            head = head.next;
            tem.next = pre.next;
            pre.next = tem;
        }
        return pre.next;
    }
}