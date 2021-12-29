package lc_2000.lc1721;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode pre = head;
        int t=k;
        while (t>0){
            --t;
            pre = pre.next;
        }
        ListNode las = head;
        ListNode tem = pre;
        while (tem != null){
            las = las.next;
            tem = tem.next;
        }
        t = pre.val;
        pre.val = las.val;
        las.val = t;
        return head;
    }
}
