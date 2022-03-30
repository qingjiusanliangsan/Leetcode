package lc_1000.lc145;

import ALib.TreeNode;

import java.util.ArrayList;
import java.util.List;
/**
 * @author qingjiusanliangsan
 * create 2021-05-19-23:24
 */
public class Solution {
    List<Integer> ret = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        make(root);
        return ret;
    }
    public void make(TreeNode root){
        if(root != null){
            make(root.left);
            make(root.right);
            ret.add(root.val);
        }
    }
}
