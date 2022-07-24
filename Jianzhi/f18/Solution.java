package Jianzhi.f18;

/**
 * @author qingjiusanliangsan
 * create 2022-07-21-12:33
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode tem = pre;
        while (tem != null){
            if(tem.next != null && tem.next.val==val){
                tem.next = tem.next.next;
                break;
            }
            tem = tem.next;
        }
        return pre.next;
    }
}