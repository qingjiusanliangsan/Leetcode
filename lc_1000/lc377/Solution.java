package lc_1000.lc377;

/**
 * @author qingjiusanliangsan
 * create 2021-04-24-8:43
 */
/*public class Solution {
    TreeSet<Integer> hset = new TreeSet<>();
    int ret = 0;
    int m = 0;
    int[] index;
    public int combinationSum4(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=target){
                m++;
                hset.add(nums[i]);
            }
        }
        index = new int[m];
        for(int i=0;i<n;i++){
            if(nums[i]<=target){
                index[--m] = nums[i];
            }
        }
        m = index.length;
        Arrays.sort(index);
        findIt(target);
        return ret;
    }
    public void findIt(int target){
        if(hset.contains(target)){
            ret++;
        }
        for(int i =0; i<m; i++){
            if(target-index[i]>=1){
                findIt(target-index[i]);
            }
            else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        *//*int[] nums = {1,2,3};
        int target = 4;*//*
        int[] nums = {9};
        int target = 3;
        System.out.println(so.combinationSum4(nums,target));
    }


}*/
public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}
