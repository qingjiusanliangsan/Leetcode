package competition.double_50;

/**
 * @author qingjiusanliangsan
 * create 2021-04-17-22:31
 */
public class Solution1 {
    public int minOperations(int[] nums) {
        int ret = 0;
        int n= nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                continue;
            }
            else{
                ret = ret+ nums[i-1]+1 - nums[i];
                nums[i]=nums[i-1]+1;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        int[] nums = {1, 5};
        System.out.println(s1.minOperations(nums));

    }
}
