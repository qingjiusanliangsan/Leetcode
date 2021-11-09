package lc_1000.lc817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public int numComponents(ListNode head, int[] nums) {
        int n =nums.length;
        int ret = n;
        ListNode tem = head;
        Set<Integer> hmap = new HashSet<>();
        for(int e:nums){
            hmap.add(e);
        }
        while(tem != null){
            if(hmap.contains(tem.val)){
                while(tem.next != null && hmap.contains(tem.next.val)){
                    --ret;
                    tem=tem.next;
                }
            }
            tem = tem.next;
        }
        return ret;
    }
}
