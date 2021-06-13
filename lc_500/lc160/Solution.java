package lc_500.lc160;

/**
 * @author qingjiusanliangsan
 * create 2021-06-04-9:20
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = 0;
        int n = 0;
        ListNode temA = headA;
        ListNode temB = headB;
        while(temA != null){
            temA = temA.next;
            ++m;
        }
        while(temB != null){
            temB = temB.next;
            ++n;
        }
        temA = headA;
        temB = headB;
        if(m>n){
            while(m != n){
                temA = temA.next;
                --m;
            }
        }
        else if(m<n){
            while(m != n){
                temB = temB.next;
                --n;
            }
        }
        while(temA!=null && temB !=null){
            if(temA ==temB){
                return temA;
            }
            temA = temA.next;
            temB = temB.next;
        }
        return null;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
