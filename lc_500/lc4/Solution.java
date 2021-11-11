package lc_500.lc4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = (m + n + 1) / 2;
        int right = (m + n + 2) / 2;
        return (findKth(nums1, 0, nums2, 0, left) + findKth(nums1, 0, nums2, 0, right)) / 2.0;
    }
    //i: nums1的起始位置 j: nums2的起始位置
    public int findKth(int[] nums1, int i, int[] nums2, int j, int k){
        if( i >= nums1.length) return nums2[j + k - 1];//nums1为空数组
        if( j >= nums2.length) return nums1[i + k - 1];//nums2为空数组
        if(k == 1){
            return Math.min(nums1[i], nums2[j]);
        }
        int midVal1 = (i + k / 2 - 1 < nums1.length) ? nums1[i + k / 2 - 1] : Integer.MAX_VALUE;
        int midVal2 = (j + k / 2 - 1 < nums2.length) ? nums2[j + k / 2 - 1] : Integer.MAX_VALUE;
        if(midVal1 < midVal2){
            return findKth(nums1, i + k / 2, nums2, j , k - k / 2);
        }else{
            return findKth(nums1, i, nums2, j + k / 2 , k - k / 2);
        }
    }
}

/*
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] num = new int[n+m];
        int a=0,b=0,c=0;
        double ret;
        while(a<n && b<m){
            if(nums1[a] < nums2[b]){
                num[c++] = nums1[a++];
            }
            else if(nums1[a] > nums2[b]){
                num[c++] = nums2[b++];
            }
            else{
                num[c++] = nums1[a++];
                num[c++] = nums2[b++];
            }
        }
        if(a==n && b<m){
            while(b<m){
                num[c++] = nums2[b++];
            }
        }
        else if(b==m && a<n){
            while(a < n){
                num[c++] = nums1[a++];
            }
        }
        c = n+m;
        if(c%2==0){
            ret = (num[c/2-1] + num[c/2])/2.0;
        }
        else{
            ret = (double)num[c/2];
        }
        return ret;
    }
}*/
