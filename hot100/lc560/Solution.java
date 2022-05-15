package hot100.lc560;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qingjiusanliangsan
 * create 2022-05-15-10:21
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> hmap = new HashMap<>();
        int res=0;
        int[] sumarr= new int[n];
        sumarr[0] = nums[0];
        for(int i=1;i<n;i++){
            sumarr[i] = nums[i]+sumarr[i-1];
        }
        for(int i=0;i<n;i++){
            if(sumarr[i]==k){
                res++;
            }
            res += hmap.getOrDefault(sumarr[i]-k,0);
            hmap.put(sumarr[i],hmap.getOrDefault(sumarr[i],0)+1);
        }
        return res;
    }
}