package lc_1000.lc905;

/**
 * @author qingjiusanliangsan
 * create 2021-12-19-22:56
 */
public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int a=0,b=n-1,tem;
        while (a<b){
            if(nums[a]%2==0){
                ++a;
                continue;
            }
            if(nums[b]%2==1){
                --b;
                continue;
            }
            if(a>=b){
                break;
            }
            tem=nums[a];
            nums[a] = nums[b];
            nums[b] = tem;
            ++a;
            --b;
        }
        return nums;
    }
}