package lc_1000.lc538;

/**
 * @author qingjiusanliangsan
 * create 2022-05-15-11:14
 */
import ALib.TreeNode;

public class Solution {
    public TreeNode convertBST(TreeNode root) {
        int tem = makeRi(root,0);
        return root;
    }
    public int makeRi(TreeNode root,int z){
        if(root != null){
            int ri = makeRi(root.right,z);
            root.val = root.val+ ri;
            int le = makeRi(root.left,root.val);
            return le;
        }
        return z;
    }
}