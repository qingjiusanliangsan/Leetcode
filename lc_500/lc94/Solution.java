package lc_500.lc94;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2021-05-19-18:26
 */
public class Solution {
    List<Integer> ret = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        make(root);
        return ret;
    }
    public void make(TreeNode root){
        if(root != null){
            make(root.left);
            ret.add(root.val);
            make(root.right);
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
