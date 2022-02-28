package lc_1000.lc553;

/**
 * @author qingjiusanliangsan
 * create 2022-02-27-16:47
 */
public class Solution {
    public String optimalDivision(int[] nums) {
        int n=nums.length;
        StringBuffer str= new StringBuffer();
        StringBuffer ans= new StringBuffer();
        for(int i=0;i<n;++i){
            if(i==0 && i<n-2){
                ans.append(nums[i]);
                ans.append("/");
                ans.append("(");
                str.append(")");
            }
            else if(i<n-1){
                ans.append(nums[i]);
                ans.append("/");
            }
            else{
                ans.append(nums[i]);
            }
        }
        ans.append(str);
        return ans.toString();
    }
}