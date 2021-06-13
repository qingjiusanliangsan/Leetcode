package lc_500.lc62;

/**
 * @author qingjiusanliangsan
 * create 2021-03-27-8:59
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        ListNode tem = head;
        int n = 0;
        while(tem.next != null){
            tem=tem.next;
            n++;
        }
        tem.next=head;
        k = k%n;
        for(int i=1;i<=n-k;i++){
            tem=tem.next;
        }
        head = tem.next;
        tem.next = null;
        return head;

    }
}