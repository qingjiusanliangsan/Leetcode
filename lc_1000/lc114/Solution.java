package lc_1000.lc114;

/**
 * @author qingjiusanliangsan
 * create 2022-05-15-23:57
 */
import ALib.TreeNode;

import java.util.Stack;

public class Solution {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stcTree = new Stack<>();
        TreeNode pre = new TreeNode();
        pre.left = null;
        stcTree.push(root);
        while (!stcTree.isEmpty()){
            TreeNode tem = stcTree.pop();
            if(tem != null){
                stcTree.push(tem.right);
                stcTree.push(tem.left);
                tem.left = null;
                tem.right = null;
                pre.right = tem;
                pre = tem;
            }
        }

    }
}
