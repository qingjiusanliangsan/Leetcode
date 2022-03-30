package lc_2000.lc1013;

public class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int e:arr){
            sum+=e;
        }
        if(sum%3!=0){
            return false;
        }
        int k = sum/3,a=0,b=n-1;
        int tema = arr[a],temb=arr[b];
        while (a+1<n){
            if(tema == k){
                break;
            }
            tema+=arr[++a];
        }
        while (b-1>=0){
            if(temb == k){
                break;
            }
            temb+=arr[--b];
        }
        if(tema==k && temb==k && a<b-1){
            return true;
        }
        return false;

    }
}