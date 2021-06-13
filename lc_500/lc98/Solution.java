package lc_500.lc98;
import ALib.TreeNode;

/**
 * @author qingjiusanliangsan
 * create 2021-05-25-14:56
 */
public class Solution {
    boolean flag;
    int temval;
    public boolean isValidBST(TreeNode root) {
        flag = true;
        TreeNode head = root;
        while (head.left !=null){
            head = head.left;
        }
        temval = head.val -1;
        make(root);

        return flag;
    }
    public void make(TreeNode tem){
        if(flag && tem != null){
            make(tem.left);
            if(tem.val <= temval){
                flag = false;
                return;
            }
            temval = tem.val;
            make(tem.right);
        }
        System.out.println(temval);
    }


}
