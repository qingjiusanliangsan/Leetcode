package lc_1000.lc75;

public class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int a=0,b=n-1;
        while (a<b){
            if(nums[a]==0){
                ++a;
                continue;
            }
            if(nums[b]==0){
                int tem = nums[a];
                nums[a] = nums[b];
                nums[b] = tem;
                ++a;
            }
            --b;
        }
        b= n-1;
        while (a<b){
            if(nums[b]==2){
                --b;
                continue;
            }
            if(nums[a]==2){
                int tem = nums[a];
                nums[a] = nums[b];
                nums[b] = tem;
                --b;
            }
            ++a;
        }
    }
}