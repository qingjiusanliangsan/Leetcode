package lc_2000.lc1748;

/**
 * @author qingjiusanliangsan
 * create 2022-02-13-21:21
 */
public class Solution {
    public int sumOfUnique(int[] nums) {
        int res = 0;
        int[] hash = new int[101];
        for(int e: nums){
            ++hash[e];
        }
        for(int i=0;i<101;++i){
            if(hash[i]==1){
                res+=i;
            }
        }
        return res;
    }
}
