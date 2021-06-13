package lc_500.Lc80;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-04-06-9:01
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int max = nums[n-1]+1;
        int m=0;
        for(int i=0;i<n;i++){
            int tem = nums[i];
            int j = i+2;
            if(j<n&&tem!=nums[j]){
                continue;
            }
            if(j<n&&tem==nums[j]){
                for(;j<n;j++){
                    if(nums[j]==tem){
                        nums[j]=max;
                        m++;
                    }
                    else{
                        break;
                    }
                }
                i = j-1;
            }
        }
        Arrays.sort(nums);
        return n-m;
    }
}
