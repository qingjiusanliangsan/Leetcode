package lc_500.lc213;

/**
 * @author qingjiusanliangsan
 * create 2021-04-15-22:13
 */
public class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] tem = new int[n];
        int[] sem = new int[n];
        int ret=0;
        if(n<=3){
            ret = nums[0];
            for(int i=1;i<n;i++){
                ret = Math.max(nums[i],ret);
            }
            return ret;
        }
        for(int i=0;i<n;i++){
            tem[i] = nums[i];
            sem[i] = nums[i];
        }
        tem[2] = tem[2] + tem[0];
        sem[3] = sem[3] + sem[1];
        for(int i=3;i<n;i++){
            if(i<n-1){
                tem[i] += Math.max(tem[i-2] , tem[i-3]);
            }
            if(i>=4){
                sem[i] +=(Math.max(sem[i-2] , sem[i-3]));
            }
        }
        for(int i=n-4;i<n;i++){
            ret = Math.max(tem[i],ret);
            ret = Math.max(sem[i],ret);
        }
        return ret;
    }
}
