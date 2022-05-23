package lc_1000.lc238;

/**
 * @author qingjiusanliangsan
 * create 2022-05-17-11:03
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0]=nums[0];
        int tem=nums[n-1];
        for(int i=1;i<n-1;i++){
            res[i] = nums[i]*res[i-1];
        }
        res[n-1] = res[n-2];
        for(int i=n-2;i>0;i--){
            res[i] = res[i-1]*tem;
            tem *=nums[i];
        }
        res[0] = tem;
        return res;
    }
}
//    public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] lenum = new int[n];
//        int[] rinum = new int[n];
//        int[] res = new int[n];
//        lenum[0]=nums[0];
//        rinum[n-1]=nums[n-1];
//        for(int i=1;i<n-1;i++){
//            lenum[i] = nums[i]*lenum[i-1];
//        }
//        for(int i=n-2;i>=0;i--){
//            rinum[i] = nums[i]*rinum[i+1];
//        }
//        res[0] = rinum[1];
//        res[n-1] = lenum[n-2];
//        for(int i=1;i<n-1;i++){
//            res[i] = lenum[i-1]*rinum[i+1];
//        }
//        return res;
//    }
