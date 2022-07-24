package Jianzhi.f21;

/**
 * @author qingjiusanliangsan
 * create 2022-07-21-12:38
 */
public class Solution {
    public int[] exchange(int[] nums) {
        int n = nums.length;
        int a = 0;
        int b = n-1;

        while (a<b){
            while (a<n && nums[a]%2==1){
                a++;
            }
            while (b>=0 && nums[b]%2==0){
                b--;
            }
            if(a>b){
                break;
            }
            else{
                int tem = nums[a];
                nums[a] = nums[b];
                nums[b] = tem;
                a++;
                b--;
            }
        }

        return nums;
    }
}