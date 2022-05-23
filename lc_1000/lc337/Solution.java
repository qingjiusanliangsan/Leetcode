package lc_1000.lc337;

/**
 * @author qingjiusanliangsan
 * create 2022-05-16-23:38
 */
import ALib.TreeNode;


public class Solution {
    public int rob(TreeNode root) {
        int[] ans = robmake(root);
        return Math.max(ans[0],ans[1]);
    }
    public int[] robmake(TreeNode root){
        if(root==null){
            return new int[2];
        }
        int[] res = new int[2];
        int[] res_a = robmake(root.left);
        int[] res_b = robmake(root.right);
        res[0] = Math.max(res_a[0],res_a[1]) + Math.max(res_b[0],res_b[1]);
        res[1] = root.val + res_a[0] + res_b[0];
        return res;
    }
}