package lc_2000.lc1791;

import java.util.HashSet;
import java.util.Set;

/**
 * @author qingjiusanliangsan
 * create 2022-02-18-19:09
 */
public class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> haset = new HashSet<>();
        haset.add(edges[0][0]);
        haset.add(edges[0][1]);
        if(haset.contains(edges[1][0])){
            return edges[1][0];
        }
        else{
            return edges[1][1];
        }
    }
}