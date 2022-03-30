package lc_1000.lc101;
import ALib.TreeNode;
/**
 * @author qingjiusanliangsan
 * create 2021-05-19-18:55
 */
public class Solution {
    boolean flag;
    public boolean isSymmetric(TreeNode root) {
        flag = true;
        make(root.left,root.right);
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
                    make(p.left,q.right);
                    make(p.right,q.left);
                }
            }
            else{
                if(q!=null){
                    flag=false;
                }
            }
        }
    }
    /*判断平衡二叉树
    boolean ret;
    public boolean isBalanced(TreeNode root) {
        ret = true;
        judge(root,0);
        return ret;
    }
    public int judge(TreeNode root,int a){
        if(ret&&root != null){
            ++a;
            int L=judge(root.left,a);
            int R=judge(root.right,a);
            if(Math.abs(L-R)>1){
                ret = false;
            }
            return Math.max(L,R);
        }
        return a;
    }*/
}
