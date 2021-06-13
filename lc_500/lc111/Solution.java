package lc_500.lc111;
import ALib.TreeNode;


/**
 * @author qingjiusanliangsan
 * create 2021-05-19-20:08
 */
public class Solution {
    int ret;
    public int minDepth(TreeNode root) {
        ret = Integer.MAX_VALUE;
        make(root,0);
        return ret;
    }
    public void make(TreeNode root, int a){
        if(root != null){
            ++a;
            if(root.left==null && root.right==null){
                ret = Math.min(ret,a);
            }else{
                make(root.left,a);
                make(root.right,a);
            }
        }
    }

}
