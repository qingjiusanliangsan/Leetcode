package lc_1000.lc25;

import java.util.Stack;

/**
 * @author qingjiusanliangsan
 * create 2022-08-14-15:08
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1){
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode pre = new ListNode();
        ListNode preA = pre;
        ListNode tem = head;
        int n = 0;
        while (tem != null){
            n++;
            tem = tem.next;
        }
        tem = head;
        int i=1;
        while (i<=n){
            if(i+k-1<=n){
                int a =0;
                while (a<k){
                    stack.push(tem);
                    tem = tem.next;
                    a++;
                }
                while (!stack.isEmpty()){
                    ListNode p = stack.pop();
                    p.next=null;
                    preA.next = p;
                    preA = preA.next;
                }
                i=i+k;
            }
            else{
                preA.next = tem;
                break;
            }
        }
        return pre.next;
    }
}