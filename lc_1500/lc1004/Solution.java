package lc_1500.lc1004;

public class Solution {
    public int longestOnes(int[] A, int K) {
        int n = A.length;
        int pre = 0;
        int las = 0;
        int lz = 0;
        int ret = 0;
        while(pre<n&&las<n){
            while(lz<=K&&pre<n&&las<n){
                if(A[las]==1){
                    las++;
                }
                else if(A[las]==0){
                    las++;
                    if(lz==K){
                        lz++;
                        break;
                    }
                    lz++;

                }
                ret = Math.max(ret,las-pre);
            }
            while(lz>K&&pre<n&&las<n){

                if(A[pre]==0){
                    lz--;
                }
                pre++;
            }
        }
        return ret;
    }
}
