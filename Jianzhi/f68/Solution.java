package Jianzhi.f68;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author qingjiusanliangsan
 * create 2022-07-30-19:06
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        val = x;
    }
}

public class Solution {
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        Deque<Integer> sta = new Deque<>();
//        Deque<Integer> sta = new ArrayDeque<>();
        boolean tem = dfs(root,p,q);
        return ans;
    }
    public boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return false;
        }
        boolean lbo = dfs(root.left,p,q);
        boolean rbo = dfs(root.right,p,q);
        if((lbo&&rbo) || (root==p||root==q) && (lbo||rbo)){
            ans = root;
        }
        return (root==p||root==q) || lbo||rbo;
    }
}