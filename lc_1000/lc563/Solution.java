package lc_1000.lc563;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-22-15:24
 */
public class Solution {
    int res = 0;
    public int findTilt(TreeNode root) {
        int tem = make(root);
        return res;
    }
    public int make(TreeNode root){
        if(root != null){
            int a = make(root.left);
            int b = make(root.right);
            res += Math.abs(a-b);
            return a+b+root.val;
        }
        return 0;
    }
}
