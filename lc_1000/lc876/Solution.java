package lc_1000.lc876;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode two = head.next;
        while(two != null){
            head = head.next;
            two = two.next;
            if(two == null){
                break;
            }
            else{
                two = two.next;
            }
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}