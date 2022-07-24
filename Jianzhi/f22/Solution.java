package Jianzhi.f22;

/**
 * @author qingjiusanliangsan
 * create 2022-07-21-13:00
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode tem = head;
        int n = 0;
        while (tem != null){
            n++;
            tem = tem.next;
        }
        int m = n-k+1;
        while (head != null){
            m--;
            if(m==0){
                return head;
            }
            head = head.next;
        }
        return null;
    }
}