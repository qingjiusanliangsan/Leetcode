package lc_2000.lc1609;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author qingjiusanliangsan
 * create 2021-12-25-11:39
 */
class KNode{
    int k;
    TreeNode node;
    KNode(int k,TreeNode node){
        this.k= k;
        this.node = node;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<KNode> sta = new ArrayDeque<>();
        if(root.val %2==0){
            return false;
        }
        if(root.left != null){
            sta.add(new KNode(1,root.left));
        }
        if(root.right != null){
            sta.add(new KNode(1,root.right));
        }
        int pt = 0,no_val=0;
        while (!sta.isEmpty()){
            KNode temnode = sta.poll();
            if(temnode.k %2 == temnode.node.val%2){
                return false;
            }
            if(pt == temnode.k){
                if(pt%2 == 1){
                    if(temnode.node.val%2 == 1 || temnode.node.val >= no_val){
                        return false;
                    }
                }
                else{
                    if(temnode.node.val%2 == 0 || temnode.node.val <= no_val){
                        return false;
                    }
                }
            }
            else{
                pt = temnode.k;
            }
            no_val = temnode.node.val;
            if(temnode.node.left != null){
                sta.add(new KNode(temnode.k+1,temnode.node.left));
            }
            if(temnode.node.right != null){
                sta.add(new KNode(temnode.k+1,temnode.node.right));
            }
        }
        return true;
    }
}
