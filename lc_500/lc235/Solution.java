package lc_500.lc235;
import ALib.TreeNode;

import java.util.HashSet;

/**
 * @author qingjiusanliangsan
 * create 2021-05-20-15:25
 */
public class Solution {
    boolean flag;
    TreeNode ret;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        flag = true;
        HashSet<TreeNode> TreeSet =  make(root, p, q);
        return ret;
    }
    public HashSet<TreeNode> make(TreeNode root,TreeNode p, TreeNode q){
        HashSet<TreeNode> temSet = new HashSet<>();
        if(root != null){
            temSet.add(root);
            if(root.left==null&&root.right==null){
                return temSet;
            }
            temSet.addAll(make(root.right, p, q));
            temSet.addAll(make(root.left, p, q));
            if(flag&&temSet.contains(p)&&temSet.contains(q)){
                flag = false;
                ret = root;
            }
            return temSet;
        }
        return temSet;
    }
}
