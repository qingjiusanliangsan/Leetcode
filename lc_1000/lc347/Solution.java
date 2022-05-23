package lc_1000.lc347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author qingjiusanliangsan
 * create 2022-05-16-22:53
 */
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer,Integer> hmap = new HashMap<>();
        PriorityQueue<int[]> pqu = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        for(int e: nums){
            hmap.put(e,hmap.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Integer,Integer> E : hmap.entrySet()){
            if (pqu.size()<k){
                pqu.add(new int[]{E.getKey(), E.getValue()});
            }
            else{
                if(pqu.peek()[1] < E.getValue()){
                    pqu.poll();
                    pqu.add(new int[]{E.getKey(),E.getValue()});
                }
            }
        }
        int index = 0;
        while(!pqu.isEmpty()){
            ans[index++] = pqu.poll()[0];
        }
        return ans;
    }
}