package LcOther.Interface.lc1001;

public class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int k = m-1;
        while(k>=0){
            A[k+n] = A[k];
            --k;
        }
        int a = n,b=0;
        k = 0;
        while (a<n+m && b<n){
            if(A[a]<=B[b]){
                A[k++] = A[a++];
            }
            else{
                A[k++] = B[b++];
            }
        }
        while (k<n+m && a<n+m){
            A[k++] = A[a++];
        }
        while (k<n+m && b<n){
            A[k++] = B[b++];
        }
    }
}