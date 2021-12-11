package lc_1000.lc506;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];
        Map<Integer,String> hmap = new HashMap<>();
        int[] num = Arrays.copyOf(score,n);
        Arrays.sort(num);
        if(n>=1){
            hmap.put(num[n-1],"Gold Medal");
        }
        if(n>=2){
            hmap.put(num[n-2],"Silver Medal");
        }
        if(n>=3){
            hmap.put(num[n-3],"Bronze Medal");
        }
        for(int i=0;i<n-3;++i){
            hmap.put(num[i],String.valueOf(n-i));
        }
        for(int i=0;i<n;i++){
            res[i] = hmap.get(score[i]);
        }
        return res;
    }
}