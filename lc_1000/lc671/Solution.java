package lc_1000.lc671;
import ALib.TreeNode;

/**
 * @author qingjiusanliangsan
 * create 2021-05-20-21:05
 */
public class Solution {
    int ret = Integer.MAX_VALUE;
    boolean flag = true;
    public int findSecondMinimumValue(TreeNode root) {
        if(root.left==null){
            return -1;
        }
        make(root,root.val);
        if(flag)
            return -1;
        return ret;
    }
    public void make(TreeNode root,int a){
        if(root != null){
            if(a<root.val && root.val<=ret){
                flag = false;
                ret = root.val;
            }
            make(root.left,a);
            make(root.right,a);
        }
    }
}
