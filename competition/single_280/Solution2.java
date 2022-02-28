package competition.single_280;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author qingjiusanliangsan
 * create 2022-02-13-10:38
 */
public class Solution2 {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 0;
        }
        int res = nums.length;
        Map<Integer,Integer> hamp0 = new HashMap<>();
        Map<Integer,Integer> hamp1 = new HashMap<>();
        PriorityQueue<Ele> pq0 = new PriorityQueue<>((a,b) -> b.count-a.count);
        PriorityQueue<Ele> pq1 = new PriorityQueue<>((a,b) -> b.count-a.count);

        for(int i=0;i<n;i++){
            if(i%2==0){
                hamp0.put(nums[i],hamp0.getOrDefault(nums[i],0)+1);
            }
            else{
                hamp1.put(nums[i],hamp1.getOrDefault(nums[i],0)+1);
            }
        }
        for(int e:hamp0.keySet()){
            pq0.add(new Ele(e,hamp0.get(e)));
        }
        for(int e:hamp1.keySet()){
            pq1.add(new Ele(e,hamp1.get(e)));
        }
        Ele ele0 = pq0.poll();
        Ele ele1 = pq1.poll();
        Ele ele2;
        Ele ele3;
        int tem=ele0.count + ele1.count;
        if (ele0.a == ele1.a){
            if(pq1.isEmpty()){
                ele3 = new Ele(-1,0);
            }
            else{
                ele3 = pq1.poll();
            }
            if(pq0.isEmpty()){
                ele2 = new Ele(-1,0);
            }
            else{
                ele2 = pq0.poll();
            }
            tem = Math.max(ele0.count + ele3.count,ele1.count + ele2.count);
        }

        return res - tem;
    }
}
class Ele{
    int a;
    int count;
    public Ele(int a,int count){
        this.a=a;
        this.count=count;
    }
}