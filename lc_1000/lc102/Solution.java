package lc_1000.lc102;

import ALib.TreeNode;

import java.util.*;

/**
 * @author qingjiusanliangsan
 * create 2021-05-25-15:26
 */

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tem = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        int a = 1;
        int b=0;

        while (!qu.isEmpty()){
            TreeNode node = qu.remove();
            if(node.left != null){
                qu.add(node.left);
                ++b;
            }
            if(node.right != null){
                qu.add(node.right);
                ++b;
            }
            tem.add(node.val);
            --a;
            if(a==0){
                res.add(new ArrayList<>(tem));
                a=b;
                b=0;
                tem.clear();
            }
        }
        return res;
    }
}