package lc_1000.lc556;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int nextGreaterElement(int n) {
        long res=0;
        List<Integer> num = new ArrayList<>();
        while (n>0){
            num.add(n%10);
            n=n/10;
        }
        int m = num.size();
        int flag=0,tem=Integer.MAX_VALUE,p;
        for(int i=1;i<m;i++){
            int k=i-1;
            p=i;
            while (k>=0){
                if(num.get(k) > num.get(i)){
                    flag=1;
                    if(num.get(k)<tem){
                        p=k;
                        tem=num.get(k);
                    }
                }
                --k;
            }
            if(flag==1){
                num.set(p,num.get(i));
                num.set(i,tem);
                int[] pa = new int[i];
                for(int j=0;j<i;j++){
                    pa[j]=num.get(j);
                }
                Arrays.sort(pa);
                for(int j=0;j<i;j++){
                    num.set(i-j-1,pa[j]);
                }
                break;
            }
        }
        if(flag==0){
            return -1;
        }
        for(int i=m-1;i>=0;--i){
            res = res*10 + num.get(i);
        }
        if(res>Integer.MAX_VALUE){
            return -1;
        }
        return (int)res;
    }
}