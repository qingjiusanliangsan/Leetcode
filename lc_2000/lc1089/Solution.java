package lc_2000.lc1089;

public class Solution {
    public void duplicateZeros(int[] arr) {
        int n =arr.length;
        int k=0,a=0,b=n-1;
        for(int i=0;i<n;++i){
            if(arr[i]==0){
                if(i+k==n-1){
                    arr[n-1]=arr[i];
                    b=n-2;
                    break;
                }
                ++k;
            }
            a = i;
            if(i+k>=n-1){
                break;
            }
        }
        for(int j=a;j>=0;--j){
            arr[b--] = arr[j];
            if(arr[j]==0){
                arr[b--] = arr[j];
            }
        }
    }
}