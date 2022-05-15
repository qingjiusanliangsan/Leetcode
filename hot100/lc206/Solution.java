package hot100.lc206;

/**
 * @author qingjiusanliangsan
 * create 2022-05-11-13:51
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = new ListNode(0,null);
        ListNode tem;
        while (head != null){
            tem = pre.next;
            pre.next = head;
            head = head.next;
            pre.next.next = tem;
        }
        return pre.next;
    }
}
