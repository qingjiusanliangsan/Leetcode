package lc_1000.lc448;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new LinkedList<Integer>();
        int n = nums.length;
        int tem;
        for(int i =0;i<n;i++){
            if(nums[i]!=-1){
                tem = nums[i]-1;
                while(nums[tem]!=-1){
                    int a = nums[tem]-1;
                    nums[tem] = -1;
                    tem = a;
                }
            }
        }
        for(int i =0;i<n;i++){
            if(nums[i]!=-1){
                ret.add(i+1);
            }
        }
        return ret;
    }
    public static void main(String[] args){
        Solution so = new Solution();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(so.findDisappearedNumbers(nums));
    }
}