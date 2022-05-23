package lc_1000.lc21;

/**
 * @author qingjiusanliangsan
 * create 2022-05-11-18:42
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pre = new ListNode(0,null);
        ListNode tem = pre;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tem.next = list1;
                list1 = list1.next;
            }
            else{
                tem.next = list2;
                list2 = list2.next;
            }
            tem = tem.next;
        }
        tem.next = list1 != null ? list1 : list2;
        return pre.next;
    }
}