package lc_1000.lc566;

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length;
        int m = nums[0].length;
        int pre = n*m;
        int las = r*c;
        if(pre != las){
            return nums;
        }
        int[][] ret = new int[r][c];
        for(int i=0;i<pre;i++){
            ret[i/r][i%r] = nums[i/n][i%n];
        }


        return ret;
    }
}
