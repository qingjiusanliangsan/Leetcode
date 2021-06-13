package lc_1000.lc532;

import java.util.HashMap;

/**
 * @author qingjiusanliangsan
 * create 2021-06-02-22:15
 */
public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hmp = new HashMap<>();
        hmp.put(nums[0]%k,0);
        for(int i=1;i<n;i++){
            nums[i] = nums[i] + nums[i-1];
            if(nums[i]%k == 0){
                return true;
            }
            Integer tem = hmp.get(nums[i]%k);
            if(tem != null){
                if(i-tem>=2){
                    return true;
                }
                else{
                    continue;
                }
            }
            hmp.put(nums[i]%k,i);
        }
        return false;
    }
}
