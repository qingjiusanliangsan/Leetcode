package Interface.lc0202;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode tem = head;
        while (k>0){
            --k;
            tem = tem.next;
        }
        while (tem != null){
            tem = tem.next;
            head = head.next;
        }
        return head.val;
    }
}