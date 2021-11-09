package lc_500.lc237;

public class Solution {
    public void deleteNode(ListNode node) {
       /* while(node.next != null){
            node.val = node.next.val;
            if(node.next.next == null){
                node.next = null;
                break;
            }
            node = node.next;
        }*/
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}