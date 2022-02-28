package competition.single_281;

/**
 * @author qingjiusanliangsan
 * create 2022-02-20-10:16
 */
public class Solution2 {
    public ListNode mergeNodes(ListNode head) {
        ListNode tem=head;
        while (tem.next !=null){
            if(tem.next.val != 0){
                tem.val+=tem.next.val;
                tem.next=tem.next.next;
            }
            else{
                if(tem.next.next==null){
                    tem.next=null;
                    break;
                }
                else{
                    tem = tem.next;
                }
            }
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}