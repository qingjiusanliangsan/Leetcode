package lc_1000.lc897;

/**
 * @author qingjiusanliangsan
 * create 2021-04-25-8:26
 */
public class Solution {
    TreeNode head = new TreeNode(0);
    public TreeNode increasingBST(TreeNode root) {
        TreeNode tem = head;
        midT(root);
        return tem.right;
    }
    public void midT (TreeNode root){
        if(root!=null){
            midT(root.left);
            // TreeNode ind = new TreeNode(root.val);
            // head.right = ind;
            root.left = null;
            head.right = root;
            head = head.right;
            // System.out.println(root.val);
            midT(root.right);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

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
