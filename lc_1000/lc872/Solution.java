package lc_1000.lc872;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2021-05-10-12:21
 */
public class Solution {
    List<Integer> nums1 = new ArrayList<>();
    List<Integer> nums2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        make(root1,1);
        make(root2,2);
        int n = nums1.size();
        if(n != nums2.size()){
            return false;
        }
        for(int i=0;i<n;i++){
            if(nums1.get(i) != nums2.get(i)){
                return false;
            }
        }
        return true;
    }
    public void make(TreeNode root,int flage) {
        if(root != null){
            if(root.right ==null&&root.left==null){
                if(flage==1){
                    nums1.add(root.val);
                }
                else{
                    nums2.add(root.val);
                }
            }
            make(root.right,flage);
            make(root.left,flage);
        }
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