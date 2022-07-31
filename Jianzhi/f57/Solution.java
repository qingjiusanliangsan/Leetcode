package Jianzhi.f57;

import java.util.HashMap;

/**
 * @author qingjiusanliangsan
 * create 2022-07-30-15:04
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length<2){
            return new int[0];
        }
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int[] ans = new int[2];
        for(int e: nums){
            hmap.put(e,hmap.getOrDefault(e,0)+1);
        }
        for(int e: nums){
            if(hmap.containsKey(target-e)){
                if(e!=target-e){
                    ans[0]=e;
                    ans[1]=target-e;
                    return ans;
                }
                else if(e==target-e && hmap.get(e)>=2){
                    ans[0]=e;
                    ans[1]=target-e;
                    return ans;
                }
            }
        }
        return new int[0];
    }
}