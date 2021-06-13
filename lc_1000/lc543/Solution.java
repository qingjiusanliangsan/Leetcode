package lc_1000.lc543;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-20-22:28
 */
public class Solution {
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        make(root);
        return res;
    }
    public int make(TreeNode root){
        if(root != null){
            int a = make(root.left)+1;
            int b = make(root.right)+1;
            res = Math.max(res,a+b);
            System.out.println(a+ " " + b);
            return Math.max(a,b);
        }
        return -1;
    }
}
