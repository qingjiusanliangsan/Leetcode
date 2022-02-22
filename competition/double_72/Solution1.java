package competition.double_72;

/**
 * @author qingjiusanliangsan
 * create 2022-02-19-21:40
 */
public class Solution1 {
    public int countPairs(int[] nums, int k) {
        int n=nums.length;
        int ans = 0;
        for(int i=0;i<n;++i){
            for(int j=i+1;j<n;++j){
                if(nums[i]==nums[j] && i*j%k==0){
                    ++ans;
                }
            }
        }
        return ans;
    }
}