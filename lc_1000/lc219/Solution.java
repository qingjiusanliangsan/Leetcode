package lc_1000.lc219;


import java.util.HashSet;
import java.util.Set;

/**
 * @author qingjiusanliangsan
 * create 2022-01-19-13:50
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> hset = new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n && i<=k;i++){
            if(hset.contains(nums[i]) ){
                return true;
            }
            hset.add(nums[i]);
        }
        for(int i=k+1;i<n ;i++){
            hset.remove(nums[i-k-1]);
            if(hset.contains(nums[i]) ){
                return true;
            }
            hset.add(nums[i]);
        }
        return false;
    }
}
