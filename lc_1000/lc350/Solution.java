package lc_1000.lc350;

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hmap1 = new HashMap<>();
        Map<Integer,Integer> hmap2 = new HashMap<>();
        List<Integer> teml = new ArrayList<>();
        for(int e :nums1){
            if(hmap1.containsKey(e)){
                hmap1.put(e,hmap1.get(e)+1);
            }
            else{
                hmap1.put(e,1);
            }
        }
        for(int e :nums2){
            if(hmap2.containsKey(e)){
                hmap2.put(e,hmap2.get(e)+1);
            }
            else{
                hmap2.put(e,1);
            }
        }
        for(int e:hmap1.keySet()){
            if(hmap2.containsKey(e)){
                int a = Math.min(hmap1.get(e),hmap2.get(e));
                while(a>0){
                    teml.add(e);
                    --a;
                }
            }
        }
        int[] ret = new int[teml.size()];
        for(int i =0;i<teml.size();i++){
            ret[i] = teml.get(i);
        }
        return ret;
    }
}
