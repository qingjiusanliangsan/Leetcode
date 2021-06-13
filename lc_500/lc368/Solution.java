package lc_500.lc368;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2021-04-23-9:21
 */
public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[][] index = new int[n][2];
        int tem=0;
        int ans=0;
        List<Integer> ret = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            index[i][0]=i;
            index[i][1]=1;
        }
        for(int i=1;i<n;i++){
            tem=0;
            ans=-1;
            for(int j=i-1;j>=0;j--){
                if(nums[i] % nums[j]==0){
                    if(index[j][1]>tem){
                        tem = index[j][1];
                        ans = j;
                    }
                }
            }
            if(ans!=-1){
                index[i][0]=ans;
                index[i][1]+=tem;
            }
        }
        tem=0;
        ans=0;
        for(int i=0;i<n;i++){
            if(index[i][1]>tem){
                tem = index[i][1];
                ans = i;
            }
        }
        while(true){
            ret.add(nums[ans]);
            if(ans != index[ans][0]){
                ans = index[ans][0];
            }
            else{
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution so = new Solution();
//        int[] nums = {1,3,6,2,9,24};
        int[] nums = {1,2,4,8,57,456};
        System.out.println(so.largestDivisibleSubset(nums));
    }
}
