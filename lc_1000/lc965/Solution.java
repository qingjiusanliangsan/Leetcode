package lc_1000.lc965;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-20-19:04
 */
public class Solution {
    boolean flag;
    public boolean isUnivalTree(TreeNode root) {
        flag=true;
        make(root,root.val);
        return flag;
    }
    public void make(TreeNode root,int a){
        if(flag&&root != null){
            if(root.val != a){
                flag = false;
                return;
            }
            make(root.left,a);
            make(root.right,a);
        }
    }
}
