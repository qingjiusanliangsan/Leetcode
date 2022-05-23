package lc_1000.lc236;

/**
 * @author qingjiusanliangsan
 * create 2022-05-17-12:32
 */
import ALib.TreeNode;

public class Solution {
    TreeNode res=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return res;
    }
    public Boolean dfs(TreeNode root,TreeNode p,TreeNode q){
        if(res != null || root == null){
            return false;
        }
        boolean le = dfs(root.left,p,q);
        boolean ri = dfs(root.right,p,q);
        if(root == p || root== q){
            if(le || ri){
                res=root;
                return false;
            }
            return true;
        }
        if(le && ri){
            res=root;
            return false;
        }
        return le || ri;
    }
}
