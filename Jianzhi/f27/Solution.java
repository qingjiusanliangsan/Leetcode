package Jianzhi.f27;

/**
 * @author qingjiusanliangsan
 * create 2022-07-21-19:20
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return root;
        }
        else{
            make(root);
        }
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