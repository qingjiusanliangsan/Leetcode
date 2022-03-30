package lc_1000.lc27;

/**
 * @author qingjiusanliangsan
 * create 2021-04-19-11:27
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int n =nums.length;
        int a=0;
        int b=0;
        while(b<n){
            if(nums[b]!=val){
                nums[a++] = nums[b];
            }
            b++;
        }
        return a;
    }

}
