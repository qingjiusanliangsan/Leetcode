package lc_1000.lc852;

/**
 * @author qingjiusanliangsan
 * create 2021-06-15-9:18
 * lc852. 山脉数组的峰顶索引
 */
public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int a = 1;
        int b = n-1;
        int c = 0;
        while(a<b){
            c = a+(b-a)/2;
            if(arr[c]>arr[c-1]&&arr[c]>arr[c+1]){
                return c;
            }
            else if(arr[c]>arr[c-1]&&arr[c]<arr[c+1]){
                a = c+1;
            }
            else if(arr[c]<arr[c-1]&&arr[c]>arr[c+1]){
                b = c-1;
            }
        }
        return a;
    }
}
