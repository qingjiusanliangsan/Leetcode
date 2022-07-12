package Jianzhi.f11;

public class Solution {
    public int minArray(int[] numbers) {
//        int n = numbers.length;
        int ans = numbers[0];
        for(int e : numbers){
            ans = Math.min(ans,e);
        }
        return ans;
    }
}