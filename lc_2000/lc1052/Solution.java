package lc_2000.lc1052;

public class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int n= grumpy.length;
        int sum=0;
        int ret;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                sum += customers[i];
            }else{
                customers[i] = customers[i]*(-1);
                if(i<X){
                    sum -= customers[i];
                }
            }

        }
        ret = sum;
        for(int j=X;j<n;j++){
            if(customers[j-X]<0){
                sum +=customers[j-X];
            }
            if(customers[j]<0){
                sum -=customers[j];
            }
            ret = Math.max(ret,sum);
        }
        return ret;
    }
}
