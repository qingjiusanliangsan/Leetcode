package lc_1000.lc658;
import java.util.*;

/**
 * @author qingjiusanliangsan
 * create 2021-11-21-19:54
 */
public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length,c=0;
        int a = binmin(arr,0,n-1,x);
        int b = binmax(arr,0,n-1,x);
        List<Integer> res = new ArrayList<>();
        if(a!=-1 && b != -1){
            if(Math.abs(arr[a]-x) <= Math.abs(arr[b]-x)){
                c = a;
            }
            else{
                c = b;
            }
        }
        else if(a==-1 && b != -1){
            c = b;
        }
        else if(a != -1 && b == -1){
            c = a;
        }
        res.add(arr[c]);
        a = c-1;
        b = c+1;
        while(k>1){
            if(a>=0&& b<=n-1){
                if(Math.abs(arr[a]-x) <= Math.abs(arr[b]-x)){
                    res.add(arr[a]);
                    --a;
                }
                else{
                    res.add(arr[b]);
                    ++b;

                }
                --k;
            }
            else if(a<0){
                res.add(arr[b]);
                ++b;
                --k;
            }
            else if(b>n-1){
                res.add(arr[a]);
                --a;
                --k;
            }
        }
        Collections.sort(res);
        return res;
    }
    public int binmin(int[] nums,int a,int b,int tar){
        int ans = -1;
        while(a<=b){
            int c = (b-a)/2 + a;
            if(nums[c]<=tar){
                ans = c;
                a = c+1;
            }
            else{
                b = c-1;
            }
        }
        if(ans != -1){
            return Math.abs(ans-tar);
        }
        return Integer.MAX_VALUE;
    }
    public int binmax(int[] nums,int a,int b,int tar){
        int ans = -1;
        while(a<=b){
            int c = (b-a)/2 + a;
            if(nums[c]>=tar){
                ans = c;
                b = c-1;
            }
            else{
                a = c+1;
            }
        }
        if(ans != -1){
            return Math.abs(ans-tar);
        }
        return Integer.MAX_VALUE;
    }
}
