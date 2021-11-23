package lc_1000.lc594;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qingjiusanliangsan
 * create 2021-11-20-10:51
 */
public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> hmap = new HashMap<>();
        int res = 0;
        for(int e: nums){
            hmap.put(e,hmap.getOrDefault(e,0)+1);
        }
        for(int e: hmap.keySet()){
            int z = hmap.getOrDefault(e+1,0);
            if(z>0){
                res = Math.max(res,z+hmap.get(e));
            }
        }
        return res;
    }
}
