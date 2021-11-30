package lc_1000.lc528;

import java.util.Random;

public class Solution {
    int[] nums;
    int n,k;
    Random rm = new Random();
    public Solution(int[] w) {
        n = w.length;
        nums = w;
        for(int i=1;i<n;i++){
            nums[i] += nums[i-1];
        }
        k=nums[n-1];
    }
    public int pickIndex() {
        int tar = rm.nextInt(k)+1;
        int a=0,b=n-1,ans=0;
        while(a<=b){
            int c = (b-a)/2+a;
            if(tar <= nums[c]){
                ans = c;
                b = c-1;
            }
            else{
                a = c+1;
            }
        }
        return ans;
    }
}
