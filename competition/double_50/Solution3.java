package competition.double_50;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-04-17-22:52
 */
public class Solution3 {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] answer = new int[n];
        int a =(int) Math.pow(2,maximumBit)-1;
        for(int i=1;i<n;i++){
            nums[i] = nums[i]^nums[i-1];
        }
        for(int i=0;i<n;i++){
            answer[n-i-1] = a^nums[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums =  {2,3,4,7};
        int maximumBit = 3;
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.getMaximumXor(nums, maximumBit)));
    }
}
