package lc_500.lc88;

/**
 * @author qingjiusanliangsan
 * create 2021-04-05-22:18
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n!=0){
            int k1=m-1;
            int k2=n-1;
            int len = n+m-1;
            while(k1>=0&&k2>=0&&len>=0){
                if(nums1[k1]>=nums2[k2]){
                    nums1[len] = nums1[k1];
                    k1--;
                }
                else if(nums1[k1]<nums2[k2]){
                    nums1[len] = nums2[k2];
                    k2--;
                }
                len--;
            }
            if(k1<0){
                while(k2>=0&&len>=0){
                    nums1[len--] = nums2[k2--];
                }
            }
            else if(k2<0&&len>=0){
                while(k1>=0){
                    nums1[len--] = nums1[k1--];
                }
            }
        }

    }
}
