package lc_1000.lc226;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-19-23:29
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        make(root);
        return root;
    }
    public void make(TreeNode root){
        if(root != null){
            TreeNode tem = root.left;
            root.left = root.right;
            root.right = tem;
            make(root.left);
            make(root.right);
        }
    }
}
