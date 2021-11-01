package lc_1000.lc575;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> mset = new HashSet<>();
        for(Integer e:candyType){
            mset.add(e);
        }
        return Math.min(mset.size(),candyType.length/2);
    }
}
