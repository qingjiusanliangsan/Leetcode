package lc_1000.lc665;

public class Solution {
    public boolean checkPossibility(int[] nums) {
        int flag;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            flag=0;
            if(nums[i]>nums[i+1]){
                int tem = nums[i];
                nums[i]=nums[i+1];
                for(int j=0;j<n-1;j++){
                    if(nums[j]>nums[j+1]){
                        flag++;
                    }
                }
                if(flag==0){
                    return true;
                }
                flag=0;
                nums[i]= tem;
                nums[i+1] = tem;
                for(int j=0;j<n-1;j++){
                    if(nums[j]>nums[j+1]){
                        flag++;
                    }
                }
                return flag==0;
            }

        }


        return true;
    }
    public static void main(String[] args){
        int[] nums = {1,4,2,3};
        Solution so = new Solution();
        System.out.println(so.checkPossibility(nums));
    }

}
