package lc_1000.lc215;

import java.util.PriorityQueue;

/**
 * @author qingjiusanliangsan
 * create 2022-05-17-13:04
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pqu = new PriorityQueue<>();
        for(int e:nums){
            if(pqu.size()<k){
                pqu.add(e);
            }
            else{
                if(e > pqu.peek()){
                    pqu.poll();
                    pqu.add(e);
                }
            }
        }
        return pqu.poll();
    }
}
