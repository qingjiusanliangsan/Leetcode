package lc_1000.lc606;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-22-15:43
 */
public class Solution {
    public String tree2str(TreeNode root) {
        return make(root);
    }
    public String make(TreeNode root){
        if(root != null){
            String tem = String.valueOf(root.val);
            if(root.left == null && root.right == null)
                return tem;
            else if(root.left == null && root.right != null)
                return tem + "()" + "(" + make(root.right) + ")";
            else if(root.left != null && root.right != null)
                return tem + "(" + make(root.left) + ")" + "(" + make(root.right) + ")";
            else if(root.left != null && root.right == null)
                return tem + "(" + make(root.left) + ")";
        }
        return "()";

    }
}