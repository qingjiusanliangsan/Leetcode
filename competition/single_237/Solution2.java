package competition.single_237;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-04-18-10:02
 */
public class Solution2 {
    public int maxIceCream(int[] costs, int coins) {
        int n= costs.length;
        Arrays.sort(costs);
        int ret= 0;
        for(int i=0;i<n;i++){
            if(coins>=costs[i]){
                coins-=costs[i];
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution2 s2 = new Solution2();

    }
}
