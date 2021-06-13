package lc_500.lc104;
import ALib.TreeNode;

/**
 * @author qingjiusanliangsan
 * create 2021-05-19-19:09
 */
public class Solution {
    int ret;
    public int maxDepth(TreeNode root) {
        ret = 1;
        make(root,0);
        return ret;
    }
    public void make(TreeNode root, int a){
        if(root != null){
            ++a;
            ret = Math.max(a,ret);
            make(root.left,a);
            make(root.right,a);
        }
    }
    TreeNode temH = new TreeNode(0);
    public TreeNode convertBiNode(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode head = root;
        while (head.left != null){
            head = head.left;
        }
        remake(root);
        return head;
    }
    public void remake(TreeNode root){
        if(root != null){
            remake(root.left);
            temH.right = root;
            temH = root;
            root.left = null;
            System.out.println(root.val);
            remake(root.right);
        }
    }
}
