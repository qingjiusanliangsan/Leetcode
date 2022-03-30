package lc_1000.lc83;

/**
 * @author qingjiusanliangsan
 * create 2021-03-26-8:57
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode tem = head;
        ListNode temn = head.next;
        while(temn!=null){
            if(tem.val == temn.val){
                tem.next=temn.next;
                temn = tem.next;
                continue;
            }
            else{
                tem = temn;
                temn = temn.next;
            }
        }
        return head;
    }
}
