package lc_1500.lc1022;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-20-19:36
 */
public class Solution {
    int res;
    public int sumRootToLeaf(TreeNode root) {
        res=0;
        make(root,0);
        return res;
    }
    public void make(TreeNode root,int sum){
        if(root != null){
            sum = 2*sum + root.val;
            if(root.left == null && root.right == null){
                res += sum;
                System.out.println(sum);
                return;
            }

            make(root.left,sum);
            make(root.right,sum);
        }
    }
}
