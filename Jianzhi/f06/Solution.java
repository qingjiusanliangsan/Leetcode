package Jianzhi.f06;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public int[] reversePrint(ListNode head) {
        int n = -1;
        ListNode tem = head;
        while (tem != null){
            n++;
            tem = tem.next;
        }
        int[] ans  = new int[n+1];
        while (head != null){
            ans[n--] = head.val;
            head = head.next;
        }

        return ans;
    }
}