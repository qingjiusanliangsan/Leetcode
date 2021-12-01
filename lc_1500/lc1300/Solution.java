package lc_1500.lc1300;

import java.util.Arrays;

public class Solution {
    public int findBestValue(int[] arr, int target) {
        int big = 0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
            big = big > i ? big : i;
        }
        if(sum <= target) return big;
        int ans = target / arr.length;
        sum = getSum(arr, ans);
        while(sum < target) {
            int sumn = getSum(arr, ans + 1);
            if(sumn >= target)
                return target - sum <= sumn - target ? ans : ans + 1;
            sum = sumn;
            ans++;
        }
        return 0;
    }

    public int getSum(int[] arr, int value) {
        int sum = 0;
        for (int i : arr) sum += i < value ? i : value;
        return sum;
    }
}