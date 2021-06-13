package lc_1000.lc888;

import java.util.Arrays;

public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] ret = new int[2];
        int x;
        int sumA = 0;
        int sumB = 0;
        int na = A.length;
        int nb = B.length;
        for(int i=0;i<na;i++){
            sumA = sumA +A[i];
        }
        for(int i=0;i<nb;i++){
            sumB = sumB + B[i];
        }
        if(sumA>sumB){
            Arrays.sort(B);
            x = sumA - sumB;
            for(int i=na-1;i>=0;i--){
                for(int j=0;j<nb;j++){
                    if(A[i]*2-B[j]*2 == x){
                        ret[0]=A[i];
                        ret[1]=B[j];
                        return ret;
                    }
                    if(A[i]*2-B[j]*2 < x){
                        break;
                    }
                }
            }
        }
        else if(sumA < sumB){
            Arrays.sort(A);
            x = sumB - sumA;
            for(int j=nb-1;j>=0;j--){
                for(int i=0;i<na;i++){
                    if(B[j]*2-A[i]*2 == x){
                        ret[0]=A[i];
                        ret[1]=B[j];
                        return ret;
                    }
                    if(B[j]*2-A[i]*2 < x){
                        break;
                    }
                }
            }
        }
        return ret;
    }
     public static void main(String[] args){
         int[] A = {1,1};
         int[] B = {2,2};
         Solution so = new Solution();
         System.out.println(Arrays.toString(so.fairCandySwap(A,B)));
     }
}