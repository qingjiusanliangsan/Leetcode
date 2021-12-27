package Interface.lc0207;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0,b= 0;
        ListNode Anode = headA;
        ListNode Bnode = headB;
        while (Anode != null){
            ++a;
            Anode = Anode.next;
        }
        while (Bnode != null){
            ++b;
            Bnode = Bnode.next;
        }
        Anode = headA;
        Bnode = headB;
        while (a!=b){
            if(a>b){
                Anode = Anode.next;
                --a;
            }
            else{
                Bnode = Bnode.next;
                --b;
            }
        }
        while (a>=0 && Anode!=null && Bnode!=null){
            if(Anode == Bnode){
                return Anode;
            }
            else{
                Anode = Anode.next;
                --a;
                Bnode = Bnode.next;
                --b;
            }
        }
        return null;
    }
}
