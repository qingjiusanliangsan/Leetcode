package lc_1000.lc100;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-19-18:43
 */
public class Solution {
    public boolean flag;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        flag = true;
        make(p, q);
        return flag;
    }
    public void make(TreeNode p, TreeNode q){
        if(flag){
            if(p!=null){
                if(q==null || q.val!=p.val){
                    flag = false;
                    return;
                }
                else{
                    make(p.left,q.left);
                    make(p.right,q.right);
                }
            }
            else{
                if(q!=null){
                    flag=false;
                }
            }
        }
    }
}
