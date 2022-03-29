package hot100.lc2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int A = 0;
        ListNode head = new ListNode(A,null);
        ListNode tem = head;
        while (l1 !=null || l2 !=null){
            int L1 = l1 == null ? 0:l1.val;
            int L2 = l2 == null ? 0:l2.val;
            A = A + L1 + L2;
            tem.next = new ListNode(A%10,null);
            A = A/10;
            tem = tem.next;
            if(l1 !=null){
                l1 = l1.next;
            }
            if(l2 !=null){
                l2 = l2.next;
            }
        }
        if(A>0){
            tem.next = new ListNode(A%10,null);
        }
        return head.next;
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
