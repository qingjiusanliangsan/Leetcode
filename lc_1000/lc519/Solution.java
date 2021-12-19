package lc_1000.lc519;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author qingjiusanliangsan
 * create 2021-11-27-19:30
 */
public class Solution {
    int pl,m,n;
    Random rm = new Random();
    Map<Integer,Integer> hmap = new HashMap<>();;
    public Solution(int m, int n) {
        this.m = m;
        this.n = n;
        pl = m*n;
    }
    public int[] flip() {
        int tem = rm.nextInt(pl);
        int ind = hmap.getOrDefault(tem,tem);
        pl--;
        hmap.put(tem,hmap.getOrDefault(pl,pl));
        return new int[]{ind/n,ind%n};
    }

    public void reset() {
        pl = m*n;
        hmap.clear();
    }
}
