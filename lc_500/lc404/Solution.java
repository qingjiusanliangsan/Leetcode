package lc_500.lc404;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-20-17:12
 */
public class Solution {
    int ret;
    public int sumOfLeftLeaves(TreeNode root) {
        ret = 0;
        make(root,0);
        return ret;
    }
    public void make(TreeNode root,int a){
        if(root != null){
            if(root.left==null&&root.right==null){
                if(a==1){
                    ret += root.val;
                }
            }
            else{
                make(root.left,1);
                make(root.right,2);
            }
        }
    }
}
