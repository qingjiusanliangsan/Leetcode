package LcOther.Interface.lc0201;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        Set<Integer> hset = new HashSet<>();
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode node = pre;
        while (node.next != null){
            if(hset.contains(node.next.val)){
                node.next = node.next.next;
                continue;
            }
            else{
                hset.add(node.next.val);
                node = node.next;
            }
        }
        return pre.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}