package lc_1500.lc1253;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int n = colsum.length;
        int m = upper+lower;
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> A_num = new ArrayList<>();
        List<Integer> B_num = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(colsum[i] == 2){
                --upper;
                --lower;
            }
            m -= colsum[i];
        }
        if(upper<0 || lower<0 || m != 0){
            return ret;
        }
        for(int i=0;i<n;i++){
            if(colsum[i]==0){
                A_num.add(0);
                B_num.add(0);
            }
            else if(colsum[i]==1){
                if(upper >= lower){
                    A_num.add(1);
                    B_num.add(0);
                    --upper;
                }
                else{
                    A_num.add(0);
                    B_num.add(1);
                    --lower;
                }
            }
            else if(colsum[i]==2){
                A_num.add(2);
                B_num.add(2);
            }
            if(upper<0 || lower<0){
                return ret;
            }
        }
        ret.add(A_num);
        ret.add(B_num);
        return ret;
    }
}
