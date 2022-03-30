package lc_1000.lc108;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-19-19:19
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return make(nums,0,nums.length-1);
    }
    public TreeNode make(int[] nums,int a,int b){
        if(a>b){
            return null;
        }
        int tem = (a+b)/2;
        TreeNode head = new TreeNode(nums[tem]);
        head.left = make(nums,a,tem-1);
        head.right = make(nums,tem+1,b);
        return head;
    }
}
