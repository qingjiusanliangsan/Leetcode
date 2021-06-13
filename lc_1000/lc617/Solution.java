package lc_1000.lc617;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-22-16:28
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 ==null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        make(root1,root2);
        return root1;
    }
    public void make(TreeNode root1, TreeNode root2){
        if(root2 != null){
            root1.val += root2.val;
            if(root1.left != null && root1.right != null){
                make(root1.left,root2.left);
                make(root1.right,root2.right);
            }
            else if(root1.left == null && root1.right == null){
                root1.left = root2.left;
                root1.right = root2.right;
            }
            else if(root1.left != null && root1.right == null){
                root1.right = root2.right;
                make(root1.left,root2.left);
            }
            else if(root1.left == null && root1.right != null){
                make(root1.right,root2.right);
                root1.left = root2.left;
            }
        }

    }
}
