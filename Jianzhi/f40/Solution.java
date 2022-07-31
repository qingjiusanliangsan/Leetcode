package Jianzhi.f40;

import java.util.PriorityQueue;

/**
 * @author qingjiusanliangsan
 * create 2022-07-30-11:07
 */
public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k==0){
            return new int[0];
        }
        int[] ans = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int e:arr){
            if(pq.size()<k){
                pq.add(e);
            }
            else{
                if(e<pq.peek()){
                    pq.poll();
                    pq.add(e);
                }
            }
        }
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
}