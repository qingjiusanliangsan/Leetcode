package lc_1500.lc1346;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        int a = 0;
        Set<Integer> hset = new HashSet<>();
        for(int e: arr){
            if(e == 0){
                ++a;
            }
            else{
                hset.add(e);
                if(hset.contains(e*2)){
                    return true;
                }
            }
        }
        if(a>=2){
            return true;
        }
        for(int e: arr){
            if(hset.contains(e*2)){
                return true;
            }
        }
        return false;
    }
}
