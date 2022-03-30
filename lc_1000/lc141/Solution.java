package lc_1000.lc141;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode one_s = head;
        ListNode two_s = head;
        while (two_s != null){
            if(two_s.next != null){
                two_s = two_s.next.next;
                one_s = one_s.next;
            }
            else{
                return false;
            }
            if(two_s == one_s){
                return true;
            }
        }
        return false;
    }
}