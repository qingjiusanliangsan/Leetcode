package Jianzhi.f25;

/**
 * @author qingjiusanliangsan
 * create 2022-07-21-17:52
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode ans = pre;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                pre.next = l1;
                l1 = l1.next;
            }
            else{
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        if(l1 != null){
            pre.next = l1;
        }
        else {
            pre.next = l2;
        }
        return ans.next;
    }
}