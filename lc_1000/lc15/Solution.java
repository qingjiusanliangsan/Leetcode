package lc_1000.lc15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        int n =  nums.length;
        int a,b,c;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if (i>0&& nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]+nums[i+1]+nums[i+2]>0){
                break;
            }
            if(nums[i]+nums[n-1]+nums[n-2]<0){
                continue;
            }
            b = i+1;
            c = n-1;
            while(b<c){
                a = nums[i] + nums[b] + nums[c];
                if(a == 0){
                    ret.add(Arrays.asList(nums[i],nums[b],nums[c]));
                    while(b<c && nums[b] == nums[b+1]){
                        b++;
                    }
                    b++;
                    while(b<c && nums[c] == nums[c-1]){
                        c--;
                    }
                    c--;
                }
                else if(a<0){
                    b++;
                }
                else{
                    c--;
                }
            }
        }
        return ret;
    }
}
