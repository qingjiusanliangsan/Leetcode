package lc_500.lc203;

/**
 * @author qingjiusanliangsan
 * create 2021-06-05-10:14
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode preHead = new ListNode(val-1,head);
        head = preHead;
        while(head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
                continue;
            }
            head = head.next;
            if(head == null){
                break;
            }
        }
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

