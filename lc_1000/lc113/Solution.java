package lc_1000.lc113;

import ALib.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2021-05-19-21:50
 */
public class Solution {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temL = new ArrayList<>();
        int a = 0;
        make(root,a,temL,targetSum);
        return ret;
    }
    public void make(TreeNode root,int a, List<Integer> temL,int targetSum){
        if(root != null){
            a+=root.val;
            List<Integer> temP = new ArrayList<>(temL);
            temP.add(root.val);
//            System.out.println(a);
            if(root.left==null&&root.right==null&&a==targetSum){
                ret.add(temP);
                return;
            }
            else{
                make(root.left,a,temP,targetSum);
                make(root.right,a,temP,targetSum);
            }
        }
    }
}
