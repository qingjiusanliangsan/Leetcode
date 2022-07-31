package Jianzhi.f52;

/**
 * @author qingjiusanliangsan
 * create 2022-07-30-12:32
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tema = headA;
        ListNode temb = headB;
        int la=0,lb=0;
        while (tema != null){
            la++;
            tema=tema.next;
        }
        while (temb != null){
            lb++;
            temb=temb.next;
        }
        tema = la<=lb? headA:headB;
        temb = la<=lb? headB:headA;
        if(la>lb){
            int a = la;
            la = lb;
            lb = a;
        }
        while (lb>la){
            temb = temb.next;
            lb--;
        }
        while (tema != null){
            if(tema==temb){
                return tema;
            }
            tema = tema.next;
            temb = temb.next;
        }
        return tema;
    }
}