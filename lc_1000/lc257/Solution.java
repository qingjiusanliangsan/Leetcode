package lc_1000.lc257;

import ALib.TreeNode;

import java.util.ArrayList;
import java.util.List;
/**
 * @author qingjiusanliangsan
 * create 2021-05-20-16:35
 */
public class Solution {
    List<String> ret = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        make(root,"");
        return ret;
    }
    public void make(TreeNode root, String s){
        if(root != null){
            s = s + root.val;
            if(root.left==null&&root.right==null){
                ret.add(s);
                return ;
            }
            make(root.left,s  + "->");
            make(root.right,s  + "->");
        }
    }
}
