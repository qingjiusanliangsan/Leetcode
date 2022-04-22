package lc_1000.lc889;

import java.util.HashMap;

/**
 * @author qingjiusanliangsan
 * create 2022-04-15-23:57
 */
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
    int index=0;
    int[] preorder;
    int[] postorder;
    HashMap<Integer,Integer> hmap = new HashMap<>();
    public TreeNode make(int left_i,int right_i){
        if (left_i > right_i) {
            return null;
        }
        int val = this.preorder[this.index];
        TreeNode head = new TreeNode(val);
        this.index--;
        head.left = make(left_i,this.hmap.get(val)-1);
        head.right = make(left_i,this.hmap.get(val)+1);
        return head;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int fid=0;
        for(int e:postorder){
            hmap.put(e,fid++);
        }

        return make(0,postorder.length-1);
    }
}