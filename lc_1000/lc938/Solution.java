package lc_1000.lc938;

/**
 * @author qingjiusanliangsan
 * create 2021-04-27-12:49
 */
public class Solution {
    private int L;
    private int H;
    int ret;
    public int rangeSumBST(TreeNode root, int low, int high) {
        ret = 0;
        L = low;
        H = high;
        mid(root);
        return ret;
    }
    public void mid(TreeNode root){
        if(root != null){
            if(root.val > L){
                mid(root.left);
            }
            System.out.println();
            ret += root.val;
            if(root.val < H){
                mid(root.right);
            }
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
