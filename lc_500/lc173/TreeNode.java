package lc_500.lc173;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2021-03-28-9:38
 */
public class TreeNode {
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
class BSTIterator {
    private List<Integer> nodelist;
    private int len;
    private int index;

    public BSTIterator(TreeNode root) {
        nodelist = new ArrayList<Integer>();
        make(root);
        len = nodelist.size();
        index=0;
    }
    private void make(TreeNode head){
        if(head != null){
            if(head.left!=null){
                make(head.left);
            }
            nodelist.add(head.val);

            if(head.right != null){
                make(head.right);
            }

        }
    }
    public int next() {
        return nodelist.get(index++);
    }

    public boolean hasNext() {
        if(index<len){
            return true;
        }
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

