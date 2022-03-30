package lc_1000.lc480;

import java.util.Arrays;

public class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] tem = new int[k];
        int star;
        long sum;
        double[] ret = new double[n-k+1];
        for(int j=0;j<k;j++){
            tem[j] = nums[j];
        }
        Arrays.sort(tem);
        if(k%2==0){
            sum = (long)tem[k/2-1]+(long)tem[k/2];
            ret[0] = (double)(sum)/2.0;
        }
        else{
            ret[0] = tem[k/2];
        }

        for(int i =k;i<n;i++){
            star = i-k+1;
            for(int j=0;j<k;j++){
                if(tem[j]==nums[star-1]){
                    tem[j]=nums[i];
                    if(j>0&&tem[j-1]>tem[j]){
                        while(j>0&&tem[j-1]>tem[j]){
                            int last = tem[j];
                            tem[j] = tem[j-1];
                            tem[j-1] = last;
                            j--;
                        }
                        break;
                    }
                    if(j<k-1&&tem[j+1]<tem[j]){
                        while(j<k-1&&tem[j+1]<tem[j]){
                            int last = tem[j];
                            tem[j] = tem[j+1];
                            tem[j+1] = last;
                            j++;
                        }
                    }

                    break;
                }
            }
            if(k%2==0){
                sum = (long)tem[k/2-1]+(long)tem[k/2];
                ret[star] = (double)(sum)/2.0;
            }
            else{
                ret[star] = tem[k/2];
            }
        }

        return ret;
    }
     public static void main(String[] args){
         int[] nums = {1,3,-1,-3,5,3,6,7};
         int k = 3;
         Solution so = new Solution();

         System.out.println(Arrays.toString(so.medianSlidingWindow(nums,k)));
     }
}
