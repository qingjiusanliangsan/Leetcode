package lc_1000.lc572;
import ALib.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author qingjiusanliangsan
 * create 2021-05-20-22:43
 */
public class Solution {
    boolean fl1;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> temS = new LinkedList<>();
        temS.add(root);
        while(!temS.isEmpty()){
            TreeNode a = temS.remove();
            if(a !=null){
                temS.add(a.left);
                temS.add(a.right);
                if(a.val == subRoot.val){
                    fl1 = true;
                    com(a,subRoot);
                    if(fl1)
                        return fl1;
                }
            }
        }
        return false;
    }

    public void com(TreeNode root, TreeNode subRoot){
        if(fl1){
            if(root != null){
                if(subRoot==null||root.val!=subRoot.val){
                    fl1 = false;
                    return;
                }
                else{
                    com(root.left,subRoot.left);
                    com(root.right,subRoot.right);
                }
            }
            else if(subRoot!=root){
                fl1 = false;
                return;
            }
        }

    }
}
