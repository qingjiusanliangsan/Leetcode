package lc_1000.lc384;

import java.util.Random;

public class Solution {
    int[] origin;
    int[] shuff;
    Random r = new Random();
    int n;
    public Solution(int[] nums) {
        n = nums.length;
        origin = new int[n];
        shuff = new int[n];
        for(int i=0;i<n;i++){
            origin[i] = nums[i];
            shuff[i] = nums[i];
        }
    }
    public int[] reset() {
        return origin;
    }

    public int[] shuffle() {
        int a = 0;
        while(a<n){
            int c = r.nextInt(n-a);
            int t = shuff[n-a-1];
            shuff[n-a-1] = shuff[c];
            shuff[c] = t;
            ++a;
        }
        return shuff;
    }
}
