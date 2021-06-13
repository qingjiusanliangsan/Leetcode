package lc_1000.lc700;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-20-19:53
 */
public class Solution {
    TreeNode res = new TreeNode();
    public TreeNode searchBST(TreeNode root, int val) {
        res = null;
        make(root,val);
        return res;
    }
    public void make(TreeNode root,int val){
        if(res == null &&root != null){
            if(val == root.val){
                res = root;
                return;
            }
            else if(val < root.val){
                make(root.left,val);
            }
            else{
                make(root.right,val);
            }
        }
    }
}
