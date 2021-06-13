package lc_1000.lc637;

import ALib.TreeNode;

import java.util.ArrayList;
import java.util.List;
/**
 * @author qingjiusanliangsan
 * create 2021-05-22-16:45
 */
public class Solution {
    int a = 0;
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        make_len(root,1);
        double[][] tem = new double[a][2];
        for(int i=0;i<a;i++){
            tem[i][0] = 0;
            tem[i][1] = 0;
        }
        get_num(root,0,tem);
        for(int i=0;i<a;i++){
            res.add(tem[i][0]/tem[i][1]);
        }
        return res;
    }
    public void make_len(TreeNode root,int r){
        if(root != null){
            if(root.left == null && root.right == null){
                a = Math.max(a,r);
                return;
            }
            make_len(root.left,r+1);
            make_len(root.right,r+1);

        }
    }
    public void get_num(TreeNode root,int r,double[][] nums){
        if(root != null){
            nums[r][0] += root.val;
            nums[r][1] += 1;
            get_num(root.left,r+1,nums);
            get_num(root.right,r+1,nums);
        }
    }
}
