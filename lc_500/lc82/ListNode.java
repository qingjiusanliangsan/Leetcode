package lc_500.lc82;

/**
 * @author qingjiusanliangsan
 * create 2021-03-25-22:47
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
        ListNode pre = new ListNode(0,head);
        ListNode phead = pre;
        ListNode tem = head;
        ListNode temn = head.next;
        while(temn!=null){
            if(tem.val == temn.val){
                while(temn!=null && tem.val == temn.val){
                    tem.next=temn.next;
                    temn = tem.next;
                    continue;
                }
                phead.next = tem.next;
                tem = tem.next;
                temn = tem==null ? null:tem.next;
            }
            else{
                phead = tem;
                tem = temn;
                temn = temn.next;
            }
        }
        return pre.next;
    }
}
