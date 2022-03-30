package lc_1000.lc102;

import ALib.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * @author qingjiusanliangsan
 * create 2021-05-25-15:26
 */

public class Solution {
    class UTree{
        TreeNode tree;
        int h;
        public UTree(TreeNode t,int a){
            tree = t;
            h = a;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        int a = 0;
        Queue<UTree> TQ = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        TQ.add(new UTree(root,a));
        List<Integer> temL = new ArrayList<>();
        while(!TQ.isEmpty()){
            UTree tem = TQ.remove();
            if(tem.tree.left != null)
                TQ.add(new UTree(tem.tree.left,tem.h+1));
            if(tem.tree.right != null)
                TQ.add(new UTree(tem.tree.right,tem.h+1));

            if(tem.h == a){
                temL.add(tem.tree.val);
            }
            else if(tem.h != a){
                res.add(new ArrayList<>(temL));
                ++a;
                temL.clear();
                temL.add(tem.tree.val);
            }
        }
        res.add(new ArrayList<>(temL));
        return res;
    }
}