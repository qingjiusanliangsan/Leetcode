package lc_2000.lc2006;

/**
 * @author qingjiusanliangsan
 * create 2022-02-13-21:04
 */
public class Solution {
    public int countKDifference(int[] nums, int k) {
        int res=0;
        int[] hash = new int[101];
        for(int e:nums){
            ++hash[e];
        }
        for(int i=1;i+k<101;i++){
            res += hash[i]*hash[i+k];
        }
        return res;
    }
}
