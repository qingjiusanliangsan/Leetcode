package lc_1000.lc1;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int n = nums.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0;i<n;++i){
            if(hmap.containsKey(target-nums[i])){
                res[0] = hmap.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            hmap.put(nums[i],i);
        }
        for(int i = 0;i<n;++i){
            if(hmap.containsKey(target-nums[i]) && i!= hmap.get(target-nums[i])){
                res[0] = hmap.get(target-nums[i]);
                res[1] = i;
                return res;
            }
        }

        return res;
    }
}