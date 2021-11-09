package lc_1000.lc532;

import java.util.*;

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


    public int findPairs(int[] nums, int k) {
        Set<List<Integer>> hset = new HashSet<>();
        Map<Integer,Integer> hmap = new HashMap<>();
        int n = nums.length;
        for(Integer e:nums){
            if(hmap.containsKey(e)){
                hmap.replace(e,hmap.get(e)+1);
            }
            else{
                hmap.put(e,1);
            }
        }
        for(int i=0;i<n;i++){
            if(k==0){
                if(hmap.get(nums[i])>1){
                    List<Integer> tem_l = new ArrayList<>();
                    tem_l.add(nums[i]);
                    tem_l.add(nums[i]);
                    hset.add(tem_l);
                }
            }
            else{
                if(hmap.containsKey(nums[i]+k)){
                    List<Integer> tem_l = new ArrayList<>();
                    tem_l.add(nums[i]);
                    tem_l.add(nums[i]+k);
                    hset.add(tem_l);
                }
            }
        }
        return hset.size();
    }
    public boolean findz(int[] nums, int a, int b, int p) {
        if (nums[a]> p || nums[b] < p) {
            return false;
        }
        if (nums[a] == p || nums[b] == p) {
            return true;
        }
        int m;
        while (a <= b) {
            m = (a + b) / 2;
            if (nums[a] == p || nums[b] == p || nums[m] == p) {
                return true;
            } else if (nums[m] > p) {
                a = a+1;
                b = m-1;
            }
            else if (nums[m] < p){
                a = m+1;
                b = b-1;
            }
        }
        return false;
    }


}
