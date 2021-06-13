package lc_1000.lc783;

/**
 * @author qingjiusanliangsan
 * create 2021-04-13-19:58
 */
public class Solution {
    public int a=-10000;
    public int b=10000;
    public int minDiffInBST(TreeNode root) {
        readTree(root);
        return b;
    }
    public void readTree(TreeNode root){
        if(root != null){
            readTree(root.left);
            b = Math.min(b, root.val-a);
            a = root.val;
            readTree(root.right);
        }

    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}