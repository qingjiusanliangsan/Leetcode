package LcOther.Interface.lc0206;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        List<Integer> Ls = new ArrayList<>();
        while (head != null){
            Ls.add(head.val);
            head = head.next;
        }
        int a = 0,b=Ls.size()-1;
        while (a<b){
            if(!Ls.get(a).equals(Ls.get(b))){
                return false;
            }
            ++a;
            --b;
        }
        return true;
    }
}
