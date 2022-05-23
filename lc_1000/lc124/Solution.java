package lc_1000.lc124;

/**
 * @author qingjiusanliangsan
 * create 2022-05-23-21:01
 */
import ALib.TreeNode;

public class Solution {
    int res;
    public int maxPathSum(TreeNode root) {
        res = root.val;
        int tem = make(root);
        return res;
    }
    public int make(TreeNode root){
        if(root == null){
            return 0;
        }
        int le = make(root.left);
        int ri = make(root.right);
        int tem = Math.max(le,ri);
        int cur_res = Math.max(tem,le+ri);

        if(cur_res>0){
            res = Math.max(res,root.val+cur_res);
        }
        else{
            res = Math.max(res,root.val);
        }
        if(tem > 0){
            return root.val + tem;
        }
        return root.val;
    }
}