package lc_1000.lc92;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int n = 0;
        ListNode preHead = new ListNode(0,head);
        ListNode temHead = preHead;
        ListNode temsec;
        head = preHead;

        while(n<left){
            temHead = head;
            head = head.next;
            n++;
        }
        temsec = head;
        ListNode a = temsec.next;
        while(n<=right){
            a = temsec.next;
            temsec.next = temHead.next;
            temHead.next = temsec;
            temsec = a;
            n++;
        }
        head.next = a;
        return preHead.next;
    }
}

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }