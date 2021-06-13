package lc_500.lc112;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-19-21:34
 */
public class Solution {
    boolean flag;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        flag = false;
        int star = 0;
        make(root,star,targetSum);
        return flag;
    }
    public void make(TreeNode root, int a,int targetSum){
        if(!flag && root != null){
            a += root.val;
            System.out.println(a);
            if(root.left==null&&root.right==null&&a==targetSum){
                flag = true;
                return;
            }
            else{
                make(root.left,a,targetSum);
                make(root.right,a,targetSum);
            }
        }
    }
}
